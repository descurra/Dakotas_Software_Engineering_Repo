package project.api.usercomputeengineapi;


import project.api.compdatastoreapi.ComputeDatabaseAPI;
import project.api.usercomputeengineapi.user.JobRequest;
import project.api.usercomputeengineapi.webserver.JobResponse;
import project.api.webservercalcapi.WebCalculateAPI;

//Implementing NetworkAPI
    //  1) Recieve request to start computation and return result status
    //  2) Request ProcessAPI implementation to read in input from user specified location
    //  3) Pass intergers to  ConceptualAPI implementation
    //  4) Request ProcessAPI implementation to write output

    //Patterns slide 48

public class NetworkAPIImplementation implements UserComputeAPI {
    private final UserComputeAPI networkAPI;


//1) Recieve request to start computation and returQQn result status
    public NetworkAPIImplementation( UserComputeAPI networkAPI) {
        this.networkAPI = networkAPI;
    }

    public NetworkAPIImplementation(ComputeDatabaseAPI processAPI, WebCalculateAPI conceptualAPI) {
        this.networkAPI = null;
        //TODO Auto-generated constructor stub
    }

    //2) Request ProcessAPI implementation to read in input from user specified location
    @Override
    public JobResponse submitJob(JobRequest job) {
        return networkAPI.submitJob(job);
        

        //Process API runs readData method
        //Submit job
        //Submit job to job handler (webserver) da
        
    }

}
