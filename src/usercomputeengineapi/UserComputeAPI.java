package usercomputeengineapi;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface UserComputeAPI {
    JobResponse submitJob(JobRequest job);
    //Job response is returned

}

//reutns job respionse 
//JobRequest submitjob (JobRequest job)
//don't use void 
//If theres a request theres a response, so return something 