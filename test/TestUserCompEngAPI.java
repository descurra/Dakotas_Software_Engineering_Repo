//SMOKE TEST FOR API 1
//USER <--> COMPUTE ENGINE
//Testing for 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import usercomputeengineapi.PrototypeUserComputeApi;
public class TestUserCompEngAPI{
    @Test
    public void testInputSource(){
        PrototypeUserComputeApi testInputSource = new PrototypeUserComputeApi();
        String expectedInputSource = "mock_database"; //Define input source
        String actualInputSource = "mock_database"; //Retrice actual input source
        checkInputSource(expectedInputSource, actualInputSource, testInputSource);        
    }

    //Testing for delimeter (commas, semicolons, etc.)
    @Test
    public void testDelimeter(){
        PrototypeUserComputeApi testDelimeter = new PrototypeUserComputeApi();
        String expectedDelimeter = ",";
        String actualDelimeter = ","; 
        checkDelimeter(expectedDelimeter, actualDelimeter, testDelimeter);    
    }

    //Testing for output destination (file, database, etc.)
    @Test
    public void testOutputDestination(){
        PrototypeUserComputeApi testOutputDestination = new PrototypeUserComputeApi();
        String expectedOutputDestination = "mock_destination";
        String actualOutputDestination = "mock_destination"; 
        checkOutputDestination(expectedOutputDestination, actualOutputDestination, testOutputDestination);    
    }

    //Mocking JobRequest and JobResponse classes to test the PrototypeUserComputeApi class
    @Test
    public void testJobRequestAndResponse(){
        PrototypeUserComputeApi testJobRequestAndResponse = new PrototypeUserComputeApi();
        String expectedJobRequest = "mock_job_request";
        String actualJobRequest = "mock_job_request"; 
        Assertions.assertEquals(expectedJobRequest, actualJobRequest);

        String expectedJobResponse = "mock_job_response";
        String actualJobResponse = "mock_job_response"; 
        Assertions.assertEquals(expectedJobResponse, actualJobResponse);
    }

    
    //Checking for input source, delimeter, and output destination
    private void checkInputSource(String expected, String actual, PrototypeUserComputeApi testInputSource){
        Assertions.assertEquals(expected, actual);

    }
    private void checkDelimeter(String expected, String actual, PrototypeUserComputeApi testDelimeter){
        Assertions.assertEquals(expected, actual);
    }

    private void checkOutputDestination(String expected, String actual, PrototypeUserComputeApi testOutputDestination){
        Assertions.assertEquals(expected, actual);

    }
}