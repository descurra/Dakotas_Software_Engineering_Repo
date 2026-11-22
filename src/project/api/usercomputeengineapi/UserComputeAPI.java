package project.api.usercomputeengineapi;

import project.annotations.NetworkAPI;
import project.api.usercomputeengineapi.user.JobRequest;
import project.api.usercomputeengineapi.webserver.JobResponse;

@NetworkAPI
public interface UserComputeAPI {
    JobResponse submitJob(JobRequest job);
    //Job response is returned

    
}

//reutns job respionse 
//JobRequest submitjob (JobRequest job)
//don't use void 
//If theres a request theres a response, so return something 