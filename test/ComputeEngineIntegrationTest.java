//INTEGRATION TEST FOR COMPUTE ENGINE 
//Use implementations
//Use test-only data store
//Give test input data: [1, 10, 25]
//Add validation to check if the output is correct

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import project.api.usercomputeengineapi.NetworkAPIImplementation;
import project.api.webservercalcapi.ConceptualAPIImplementation;
import project.api.usercomputeengineapi.UserComputeAPI;
import project.api.webservercalcapi.WebCalculateAPI;
import project.checkpointtests.InMemoryInputConfig;
import project.checkpointtests.InMemoryOutputConfig;


public class ComputeEngineIntegrationTest{

    @Test
    public void testComputeEngine(){

        
        //Test input data
        List<Integer> inputValues = Arrays.asList(1, 10, 25);

        
        
        InMemoryInputConfig inputConfig = new InMemoryInputConfig(inputValues);
        InMemoryOutputConfig outputConfig = new InMemoryOutputConfig();

        //WebCalculateAPI cAPI = new ConceptualAPIImplementation(conceptualAPI); 
        InMemoryDataStore processAPI = new InMemoryDataStore();
       // UserComputeAPI nAPI = new NetworkAPIImplementation(networkAPI); 
        List<Integer> readData = processAPI.read(inputConfig);
        List<Integer> computedResults = process(readData);
        
 
        
    }

    public void assertEquals(String message, List<String> expectedOutput, List<String> actualOutput) {
        Assertions.assertEquals(expectedOutput, actualOutput, message);
    }

    public List<Integer> process(List<Integer> readData) {
        if (readData == null) {
            return List.of(); // Return an empty list if input is null
        }
        return readData;
    }


}