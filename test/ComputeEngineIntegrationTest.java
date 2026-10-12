//TEST FOR TWO COMPUTE ENGINE COMPONENTS

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import project.annotations.ConceptualAPI;
import project.annotations.NetworkAPI;
import usercomputeengineapi.NetworkAPIImplementation;
import webservercalcapi.ConceptualAPIImplementation;


public class ComputeEngineIntegrationTest{

    @Test
    public void testComputeEngine(){
        List<Integer> inputValues = Arrays.asList(1, 10, 25);
        InMemoryInputConfig inputConfig = new InMemoryInputConfig(inputValues);
        InMemoryOutputConfig outputConfig = new InMemoryOutputConfig();

        NetworkAPI networkApi = new NetworkAPIImplementation(); 
        ConceptualAPI conceptualApi = new ConceptualAPIImplementation(); 
        InMemoryDataStore processApi = new InMemoryDataStore();
        List<Integer> readData = processApi.read(inputConfig);
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