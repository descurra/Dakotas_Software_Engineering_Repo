package compdatastoreapi;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface ComputeDatabaseAPI {
    void configureJob(String inputSource, char delimeter, String outputDestination);
    void executeJob();
    

}