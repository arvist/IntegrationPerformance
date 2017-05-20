package lv.lu.df.java.integration.service;


import lv.lu.df.java.integration.model.dto.CompanyDTO;
import lv.lu.df.java.integration.model.dto.Serie;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import java.util.ArrayList;
import java.util.List;

@Service
public class DatabaseService {

    private static final long MINUTE = 1000*60;

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    private List<CompanyDTO> pendingBatchObjects;

    public DatabaseService(){
        this.pendingBatchObjects = new ArrayList<>();
    }

    public void insertCompanyDTOInDB(CompanyDTO companyDTO) {

        pendingBatchObjects.add(companyDTO);
        executeBatchInsert();
    }

    public void doBatchInsert() {

        if(pendingBatchObjects.size() < 1){
            return; // Nothing to insert
        }

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.setFlushMode(FlushModeType.COMMIT);
        Transaction transaction = null;
        Session session = null;
        try {
            session = entityManager.unwrap(Session.class);
            transaction = session.getTransaction();
            transaction.begin();

            for(CompanyDTO companyDTO : pendingBatchObjects){

                session.save(companyDTO);
                for(Serie serie : companyDTO.getSeries()){
                    serie.setCompanyId(companyDTO.getId());
                    session.save(serie);
                }
            }
            session.flush();
            transaction.commit();
            session.close();
            this.pendingBatchObjects = new ArrayList<>();

        } catch (Exception e){
            e.printStackTrace();
            try{
                transaction.rollback();
            } catch (Exception ignored){}
            try {
            } catch (Exception ignored){}
        } finally {
            try{
                entityManager.close();
            } catch (Exception ignored){}
        }

    }

    private boolean executeBatchInsert(){
        if (this.pendingBatchObjects.size() >= 100){
            doBatchInsert();
        }
        return false;
    }
}
