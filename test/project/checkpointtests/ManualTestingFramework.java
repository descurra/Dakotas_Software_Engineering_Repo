package project.checkpointtests;

/* 
import edu.softwareeng.sample.ComputationCoordinator;  
import edu.softwareeng.sample.ComputeEngine;        conceptual api interface
import edu.softwareeng.sample.ComputeEngineImpl;
import edu.softwareeng.sample.ComputeRequest;        network api interface
import edu.softwareeng.sample.CoordinatorImpl;
import edu.softwareeng.sample.DataStore;           process api interface
import edu.softwareeng.sample.DataStoreImpl;
import edu.softwareeng.sample.FileInputConfig; InputConfig
import edu.softwareeng.sample.FileOutputConfig; OutputConfig
*/

import project.api.webservercalcapi.WebCalculateAPI;
import project.api.webservercalcapi.ConceptualAPIImplementation;

import project.api.usercomputeengineapi.UserComputeAPI;
import project.api.usercomputeengineapi.user.JobRequest;
import project.api.usercomputeengineapi.NetworkAPIImplementation;

import project.api.compdatastoreapi.ComputeDatabaseAPI;
import project.api.compdatastoreapi.ProcessAPIImplementation;

import configurations.InputConfig;
import configurations.OutputConfig; 

import project.api.usercomputeengineapi.user.JobRequest;
import project.api.usercomputeengineapi.JobRequestImp;

 




public class ManualTestingFramework {
    
    public static final String INPUT = "manualTestInput.txt";
    public static final String OUTPUT = "manualTestOutput.txt";

    public static final char DEL = ',';

    public static void main(String[] args) {
        // TODO 1:
        // Instantiate a real (ie, class definition lives in the src/ folder) implementation 
        // of all 3 APIs

        //Conceptual API implementation 
        WebCalculateAPI conceptualAPI = new ConceptualAPIImplementation();
       
        //Process API Implementation
        ComputeDatabaseAPI processAPI = new ProcessAPIImplementation();

        //Network API Implementation
        UserComputeAPI networkAPI = new NetworkAPIImplementation(processAPI, conceptualAPI);




        //
        // TODO 2:
        // Run a computation with an input file of <root project dir>/manualTestInput.txt
        // and an output of <root project dir>/manualTestOutput.txt, with a delimiter of ',' 
        //
        //
        // Helpful hint: the working directory of this program is <root project dir>,
        // so you can refer to the files just using the INPUT/OUTPUT constants. You do not 
        // need to (and should not) actually create those files in your repo

        InputConfig inputConfig = new InMemoryInputConfig(INPUT);
        OutputConfig outputConfig = new InMemoryOutputConfig(OUTPUT);
        JobRequest job = new JobRequestImp(inputConfig, outputConfig, DEL);

        networkAPI.submitJob(job);
    }
}
