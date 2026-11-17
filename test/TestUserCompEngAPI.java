//SMOKE TEST FOR API 1
//USER <--> COMPUTE ENGINE
//Testing: Job Request and Job Response, 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.usercomputeengineapi.user.JobRequest;
import project.api.usercomputeengineapi.webserver.JobResponse;

import static org.mockito.Mockito.when;
public class TestUserCompEngAPI{
    
    //Mocking JobRequest and JobResponse classes to test the PrototypeUserComputeApi class

    @Test
    public void testJobRequest() throws Exception {
        JobRequest mockJob = Mockito.mock(JobRequest.class);
        when(mockJob.getJobId()).thenReturn("mock_job_id");
        when(mockJob.getJobDescription()).thenReturn("mock_job_description");

        Assertions.assertEquals("mock_job_id", mockJob.getJobId());
        Assertions.assertEquals("mock_job_description", mockJob.getJobDescription());
    }

    @Test
    public void testJobResponse() throws Exception{
        JobResponse mockResponse = Mockito.mock(JobResponse.class);
        when(mockResponse.getJobId()).thenReturn("mock_job_id");
        when(mockResponse.getJobStatus()).thenReturn("mock_status");
        when(mockResponse.getJobResult()).thenReturn("mock_result");

        Assertions.assertEquals("mock_job_id", mockResponse.getJobId());
        Assertions.assertEquals("mock_status", mockResponse.getJobStatus());
        Assertions.assertEquals("mock_result", mockResponse.getJobResult());
    }


}

/* 
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
    }*/
