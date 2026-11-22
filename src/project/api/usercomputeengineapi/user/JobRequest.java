package project.api.usercomputeengineapi.user;

import configurations.InputConfig;
import configurations.OutputConfig;

public interface JobRequest {
    String getJobId(); //methods for job request
    String getJobDescription();
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimiter();
    
}