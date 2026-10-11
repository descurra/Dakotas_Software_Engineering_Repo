//SMOKE TEST FOR API 2

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import compdatastoreapi.PrototypeComputeDatabase;

public class TestCompEngDatabaseAPI{
    @Test
    public void testReadFromInputSource(){

        PrototypeComputeDatabase testReadFromInputSource = new PrototypeComputeDatabase();
        String source = "mock_data";
        List<Integer> expectedInput = readInputData(source);
        List<Integer> actualInput = readFromInputSource(source);

        checkInput(expectedInput, actualInput, testReadFromInputSource);
    }

    @Test
    public void testWrtieToOutputSource(){
        PrototypeComputeDatabase testWrtieToOutputSource = new PrototypeComputeDatabase();
        String source = "mock_destination";
        List<Integer> expectedDataToWrite = Arrays.asList(10, 20, 30);
        List<Integer> actualDataToWrite = writeFromInputSource(source);

        checkOutput(expectedDataToWrite, actualDataToWrite, testWrtieToOutputSource);
    }

    private List<Integer> readInputData(String source){
        return null;
    }

    private List<Integer> readFromInputSource(String source){
        return null;

    }

    private void checkInput(List<Integer> expected, List<Integer> actual, PrototypeComputeDatabase testReadFromInputSource){
        Assertions.assertEquals(expected, actual);

    }

    private List<Integer> writeFromInputSource(String source){
        return null;
    }

    private void checkOutput(List<Integer> expected, List<Integer> actual, PrototypeComputeDatabase testWriteToOutputSource){
        Assertions.assertEquals(expected, actual);
    }
}

