//TEST FOR TWO COMPUTE ENGINE COMPONENTS

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.annotations.NetworkAPI;
import project.annotations.ConceptualAPI;
import java.util.ArrayList;
import java.util.List;

public class ComputeEngineIntegrationTest{

    @Test
    public void testComputeEngine(){
        List<Integer> inputValues = Arrays.asList(1, 10, 25);
        InMemoryInputConfig inputConfig = new InMemoryInputConfig(inputValues);
        InMemoryOutputConfig outputConfig = new InMemoryOutputConfig();

        NetworkAPI networkApi = new NetworkAPIImplementation();
        
        ConceptualAPI conceptualApi = new ConceptualAPIImplementation();
        
        ProcessAPI processApi = new InMemoryDataStore();

        List<Integer> readData = processApi.read(inputConfig);
        List<Integer> computedResults = conceptualApi.process(readData);
        
        List<String> expectedOutput = Arrays.asList("2", "20", "50"); 
        assertEquals("The written output must match expected compute engine results", expectedOutput, actualOutput);
 
        
    }
}