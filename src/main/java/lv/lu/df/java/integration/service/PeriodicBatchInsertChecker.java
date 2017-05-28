package lv.lu.df.java.integration.service;

import org.springframework.stereotype.Service;

@Service
public class PeriodicBatchInsertChecker extends Thread {

    private static final long MINUTE = 1000 * 60;

    private DatabaseService databaseService;

    public PeriodicBatchInsertChecker(DatabaseService service){
        this.databaseService = service;
    }

    @Override
    public void run() {
        while(true) {
            try {
                databaseService.doBatchInsert();
                Thread.sleep(MINUTE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
