package usercomputeengineapi;


import usercomputeengineapi.user.JobRequest;
import usercomputeengineapi.webserver.JobResponse;

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

    //2) Request ProcessAPI implementation to read in input from user specified location
    @Override
    public JobResponse submitJob(JobRequest job) {
        return networkAPI.submitJob(job);
        

        //Process API runs readData method
        //Submit job
        //Submit job to job handler (webserver) da
        
    }

    




    /*@Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/

}

/*public List<Integer> read(Object inputConfig) {
        return null;
    }

    */