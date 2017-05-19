package lv.lu.df.java.integration.service;


import lv.lu.df.java.integration.model.dto.CompanyDTO;
import lv.lu.df.java.integration.model.dto.Serie;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Service
public class DatabaseService {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public void insertCompanyDTOInDB(CompanyDTO companyDTO) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Transaction transaction = null;
        Session session = null;
        try {
            session = entityManager.unwrap(Session.class);
            session.save(companyDTO);
            session.flush();

            session = entityManager.unwrap(Session.class);
            for(Serie serie : companyDTO.getSeries()){
                serie.setCompanyId(companyDTO.getId());
                session.save(serie);
            }
            session.flush();
        } catch (Exception e){
            try{
                transaction.rollback();
            } catch (Exception ignored){}
            try {
                session.close();
            } catch (Exception ignored){}
        } finally {
            try{
                entityManager.close();
            } catch (Exception ignored){}
        }
    }
}
