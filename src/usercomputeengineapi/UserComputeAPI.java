package usercomputeengineapi;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserComputeAPI {
    JobRequest submitJob(JobResponse job);
    //Job request will return the Job response

}

//reutns job respionse 
//JobRequest submitjob (JobRequest job)
//don't use void 
//If theres a request theres a response, so return something 