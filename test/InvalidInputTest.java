//Tests for if an input is 0 or less, or more than 10000
//Testing Process API


import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.compdatastoreapi.ComputeDatabaseAPI;
import project.api.compdatastoreapi.ProcessAPIImplementation;
import project.api.compdatastoreapi.calculate.Location;

public class InvalidInputTest  {

    //Test for values <= 0
    @Test 
    void testBelowOne() throws Exception{
        ComputeDatabaseAPI mockProcessAPI = Mockito.mock(ComputeDatabaseAPI.class); //Mocking Process API
        ProcessAPIImplementation dataPAI = new ProcessAPIImplementation(mockProcessAPI); //Implementing mock API, assigning to variable LocationPAI

        Location mockLocation = Mockito.mock(Location.class);
        when(mockProcessAPI.readData(mockLocation)).thenReturn(Arrays.asList(0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> { dataPAI.readData(mockLocation);});
   
    }
    
    //Test for values > 10000
    @Test 
    void testOverTenThousand() throws Exception{
        ComputeDatabaseAPI mockProcessAPI = Mockito.mock(ComputeDatabaseAPI.class); //Mocking Process API
        ProcessAPIImplementation dataPAI = new ProcessAPIImplementation(mockProcessAPI); //Implementing mock API, assigning to variable LocationPAI

        Location mockLocation = Mockito.mock(Location.class);
        when(mockProcessAPI.readData(mockLocation)).thenReturn(Arrays.asList(10001));

        Assertions.assertThrows(IllegalArgumentException.class, () -> { dataPAI.readData(mockLocation);});
   


    }


    
   

}