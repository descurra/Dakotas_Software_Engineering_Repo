//SMOKE TEST FOR API 1
//USER <--> COMPUTE ENGINE
//Testing: Job Request and Job Response, 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.usercomputeengineapi.NetworkAPIImplementation;
import project.api.usercomputeengineapi.UserComputeAPI;
import project.api.usercomputeengineapi.user.JobRequest;
import project.api.usercomputeengineapi.webserver.JobResponse;

import static org.mockito.Mockito.when;
public class TestUserCompEngAPI{
    
    //Mocking JobRequest and JobResponse classes to test the PrototypeUserComputeApi class

    @Test
    void testJobRequest() throws Exception{

        UserComputeAPI mockNetworkAPI = Mockito.mock(UserComputeAPI.class); //Mocking Network API
        NetworkAPIImplementation jobRequestNAI = new NetworkAPIImplementation(mockNetworkAPI); //Implemeneting mock API, assigning to variable JobRequestNAI

        JobRequest mockJob = Mockito.mock(JobRequest.class); //Mocking Job Request
        when(mockJob.getJobId()).thenReturn("mock_job_id");
        when(mockJob.getJobDescription()).thenReturn("mock_job_description");

        jobRequestNAI.submitJob(mockJob); 

        //Seeting if getJobId and getJobDescription methods work by comparing their outputs with the expected output
        Assertions.assertEquals("mock_job_id", mockJob.getJobId()); 
        Assertions.assertEquals("mock_job_description", mockJob.getJobDescription());
        

        
    }

    @Test
    void testJobResponse() throws Exception{
        UserComputeAPI mockNetworkAPI = Mockito.mock(UserComputeAPI.class);
        NetworkAPIImplementation jobResponseNAI = new NetworkAPIImplementation(mockNetworkAPI);

        JobRequest mockJob = Mockito.mock(JobRequest.class); //Mock job to test if reponse works
        JobResponse mockResponse = Mockito.mock(JobResponse.class); //Mocking Job Response
        
        when(mockResponse.getJobId()).thenReturn("mock_job_id");
        when(mockResponse.getJobStatus()).thenReturn("mock_status");
        when(mockResponse.getJobResult()).thenReturn("mock_result");

        when(mockNetworkAPI.submitJob(mockJob)).thenReturn(mockResponse);
        JobResponse actualResponse = jobResponseNAI.submitJob(Mockito.mock(JobRequest.class));

        Assertions.assertEquals("mock_job_id", mockResponse.getJobId());
        Assertions.assertEquals("mock_status", mockResponse.getJobStatus());
        Assertions.assertEquals("mock_result", mockResponse.getJobResult());
        
        Assertions.assertEquals(mockResponse, actualResponse);
    }


}
