package project.api.usercomputeengineapi.webserver;

public interface JobResponse {
    String getJobId(); 
    String getJobStatus();
    String getJobResult();
}