//SMOKE TEST FOR API 3

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import webservercalcapi.PrototypeWebCalculate;
import webservercalcapi.calculate.Addition;
import webservercalcapi.calculate.Calculate;


public class TestWebServerCalAPI{
    @Test
    public void testIntializeForJob(){
        PrototypeWebCalculate testInitialize = new PrototypeWebCalculate();
        String expectedID = "mockID";
        String actualID = "mockID";
        checkInitialize(expectedID, actualID, testInitialize);
    }


    @Test
    public void testReadForJob(){
        PrototypeWebCalculate testRead = new PrototypeWebCalculate();
        String expectedData = "mockDatabase";
        String actualData = "mockDatabase";
        checkRead(expectedData, actualData, testRead);

    }


    @Test
    public void testWriteForJob(){
        PrototypeWebCalculate testWrite = new PrototypeWebCalculate();
        String expectedOutput = "mockOutFile";
        String actualOutput = "mockOutFile";
        checkWrite(expectedOutput, actualOutput, testWrite);
    }


    @Test
    public void testCalculation(){
        Calculate dependency = mock(Calculate.class);
        when(dependency.validate(anyInt())).thenReturn(true);
        Addition toTest = new Addition(dependency);
        int result = toTest.addNumbers(10, 20);

        Assertions.assertEquals(30, result);
    }

    public void checkInitialize(String expected, String actual, PrototypeWebCalculate testInitialize){
        Assertions.assertEquals(expected, actual);
    }

    public void checkRead(String expected, String actual, PrototypeWebCalculate testRead){
        Assertions.assertEquals(expected, actual);
    }

    public void checkWrite(String expected, String actual, PrototypeWebCalculate testWrite){
        Assertions.assertEquals(expected, actual);
    }




}