package project.api.usercomputeengineapi;

import configurations.InputConfig;
import configurations.OutputConfig;
import project.api.usercomputeengineapi.user.JobRequest;

public class JobRequestImp implements JobRequest {
    private final String jobId;
    private final String jobDescription;
    private final InputConfig inputConfig;
    private final OutputConfig outputConfig;
    private final char delimiter;

    public JobRequestImp(InputConfig inputConfig, OutputConfig outputConfig, char delimiter) {
        this("manual-job", "Computation request", inputConfig, outputConfig, delimiter);
    }

    public JobRequestImp(String jobId, String jobDescription,
                          InputConfig inputConfig, OutputConfig outputConfig, char delimiter) {
        this.jobId = jobId;
        this.jobDescription = jobDescription;
        this.inputConfig = inputConfig;
        this.outputConfig = outputConfig;
        this.delimiter = delimiter;
    }

    
    public String getJobId() {
        return jobId;
    }


    public String getJobDescription() {
        return jobDescription;
    }


    public InputConfig getInputConfig() {
        return inputConfig;
    }

    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    public char getDelimiter() {
        return delimiter;
    }

}
