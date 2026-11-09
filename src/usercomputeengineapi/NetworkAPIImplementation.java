package usercomputeengineapi;

import java.lang.annotation.Annotation;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.List;

import project.annotations.NetworkAPI;
import project.annotations.ProcessAPI;
import project.annotations.ConceptualAPI;
import compdatastoreapi.calculate.Location;
import webservercalcapi.webserver.Comp;
import webservercalcapi.calculate.Solution;
import compdatastoreapi.calculate.Data;
import compdatastoreapi.datastorage.WriteResponse;
import usercomputeengineapi.user.JobRequest;
import usercomputeengineapi.webserver.JobResponse;

//import configurations.NetworkAPI;
//Implementing NetworkAPI
    //  1) Recieve request to start computation and return result status
    //  2) Request ProcessAPI implementation to read in input from user specified location
    //  3) Pass intergers to  ConceptualAPI implementation
    //  4) Request ProcessAPI implementation to write output

    //Patterns slide 48

public class NetworkAPIImplementation implements UserComputeAPI {

    //private final JobRequest jobRequest;
    private final ProcessAPI processAPI;
    private final ConceptualAPI conceptualAPI;


    //1) Recieve request to start computation and return result status
    public NetworkAPIImplementation(ProcessAPI processAPI, ConceptualAPI conceptualAPI) {
        this.conceptualAPI = conceptualAPI;
        this.processAPI = processAPI;
    }

    //2) Request ProcessAPI implementation to read in input from user specified location
    @Override
    public List<Integer> readData(Location read) {
        return processAPI.readData(read);
        

        //Process API runs readData method
    }

    //3) Pass intergers to  ConceptualAPI implementation
    @Override
    public Solution computeResult(Comp cal) {
        return conceptualAPI.computeResult(cal);

    }

    //4) Request ProcessAPI implementation to write output
    @Override
    public WriteResponse writeData(Data write) {
        return processAPI.writeData(write);
    }

    




    @Override
    public JobResponse submitJob(JobRequest job) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

/*public List<Integer> read(Object inputConfig) {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/