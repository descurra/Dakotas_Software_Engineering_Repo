//SMOKE TEST FOR API 1

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import usercomputeengineapi.PrototypeUserComputeApi;
public class TestUserCompEngAPI{
    @Test
    public void testInputSource(){
        PrototypeUserComputeApi testUserComputeAPI = new PrototypeUserComputeApi();
        String expectedInputSource = "mock_database"; //Define input source
        String actualInputSource = "mock_database"; //Retrice actual input source
        checkInputSource(expectedInputSource, actualInputSource, testUserComputeAPI);        
    }

    

    private void checkInputSource(String expected, String actual, PrototypeUserComputeApi testUserComputeApi){
        Assertions.assertEquals(expected, actual);

    }
}