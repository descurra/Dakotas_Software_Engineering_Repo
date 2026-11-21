//SMOKE TEST FOR API 2
//Testing: location, data, writeResponse

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import project.api.compdatastoreapi.calculate.Data;
import project.api.compdatastoreapi.calculate.Location;
import project.api.compdatastoreapi.datastorage.WriteResponse;
import project.api.compdatastoreapi.ComputeDatabaseAPI;
import project.api.compdatastoreapi.ProcessAPIImplementation;

import static org.mockito.Mockito.when;

public class TestCompEngDatabaseAPI{

    @Test
    void testLocation() throws Exception{
        ComputeDatabaseAPI mockProcessAPI = Mockito.mock(ComputeDatabaseAPI.class); //Mocking Process API
        ProcessAPIImplementation locationPAI = new ProcessAPIImplementation(mockProcessAPI); //Implementing mock API, assigning to variable LocationPAI

        Location mockLocation = Mockito.mock(Location.class);
        when(mockLocation.getLocationId()).thenReturn("mock_location_id");
        when(mockLocation.getLocationPath()).thenReturn("mock_location_path");

        locationPAI.readData(mockLocation);

        Assertions.assertEquals("mock_location_id", mockLocation.getLocationId());
        Assertions.assertEquals("mock_location_path", mockLocation.getLocationPath());
    }

    @Test
    void testData() throws Exception{

        ComputeDatabaseAPI mockProcessAPI = Mockito.mock(ComputeDatabaseAPI.class);
        ProcessAPIImplementation dataPAI = new ProcessAPIImplementation(mockProcessAPI);

        Data mockData = Mockito.mock(Data.class);
        when(mockData.getDataId()).thenReturn("mock_data_id");
        when(mockData.getDataContent()).thenReturn(Arrays.asList(1, 10, 25));

        dataPAI.writeData(mockData);

        Assertions.assertEquals("mock_data_id", mockData.getDataId());
        Assertions.assertEquals(Arrays.asList(1, 10, 25), mockData.getDataContent());
    }

    @Test
    void testWriteResponse() throws Exception{
        ComputeDatabaseAPI mockProcessAPI = Mockito.mock(ComputeDatabaseAPI.class);
        ProcessAPIImplementation writeResponsePAI = new ProcessAPIImplementation(mockProcessAPI);

        Data mockData = Mockito.mock(Data.class);
        WriteResponse mockWriteResponse = Mockito.mock(WriteResponse.class);

        when(mockWriteResponse.getStatus()).thenReturn("mock_status");
        when(mockWriteResponse.getMessage()).thenReturn("mock_message");
        when(mockWriteResponse.getOutput()).thenReturn(Arrays.asList(1, 10, 25));

        when(mockProcessAPI.writeData(mockData)).thenReturn(mockWriteResponse);
        WriteResponse actualWriteResponse = writeResponsePAI.writeData(mockData);

        Assertions.assertEquals("mock_status", mockWriteResponse.getStatus());
        Assertions.assertEquals("mock_message", mockWriteResponse.getMessage());
        Assertions.assertEquals(Arrays.asList(1, 10, 25), actualWriteResponse.getOutput());
    }
    

   
   
}

