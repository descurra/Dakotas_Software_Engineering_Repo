package usercomputeengineapi;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserComputeAPI {
    void configureJob(String inputSource, char delimeter, String outputDestination);
    
    
}