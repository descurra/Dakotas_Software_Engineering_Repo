//API 1
//USER <--> COMPUTE ENGINE
//USER = FRONT END 
//COMPUTE ENGINE = BACK END 

package usercomputeengineapi;
import project.annotations.NetworkAPIPrototype;
import usercomputeengineapi.user.JobRequest;
import usercomputeengineapi.webserver.JobResponse;

public class PrototypeUserComputeApi{
    @NetworkAPIPrototype
    public void prototype(UserComputeAPI api, JobRequest newJob){
        JobResponse jobRes = submit.submitJob(newJob); 

        //api takes in the UserComputeAPI object
        //Calls UserComputeAPI object to return the response of the job submission
    } 
    private UserComputeAPI submit; //user submits job

    public PrototypeUserComputeApi(UserComputeAPI submit){ //Return type
        this.submit = submit;
    }

}


        //Only process submit job with JobResponse object (placeholder)
        //calling the interfaces in the APIs, doesn't have to be implemented
        //Smoke tests don't pass objects, only unit tests to mock objects related tto the interfaces 
        //API --> Prototype, --> Project

         /*public void prototype(JobRequest newJob){
        JobResponse jobRes = submit.submitJob(newJob); 
        
        //jobRes takes in the submit object
        //Calls JobResponse object to return the response of the job submission

    }*/
