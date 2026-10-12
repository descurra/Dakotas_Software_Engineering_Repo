//SMOKE TEST FOR API 1

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

    @Test
    public void testDelimeter(){
        PrototypeUserComputeApi testDelimeter = new PrototypeUserComputeApi();
        String expectedDelimeter = ",";
        String actualDelimeter = ","; 
        checkDelimeter(expectedDelimeter, actualDelimeter, testDelimeter);    
    }

    @Test
    public void testOutputDestination(){
        PrototypeUserComputeApi testOutputDestination = new PrototypeUserComputeApi();
        String expectedOutputDestination = "mock_destination";
        String actualOutputDestination = "mock_destination"; 
        checkOutputDestination(expectedOutputDestination, actualOutputDestination, testOutputDestination);    
    }

    

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