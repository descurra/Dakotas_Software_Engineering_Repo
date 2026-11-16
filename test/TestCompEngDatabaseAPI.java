//SMOKE TEST FOR API 2
//Testing: location, data, writeResponse

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

import compdatastoreapi.calculate.Data;
import compdatastoreapi.calculate.Location;
import compdatastoreapi.datastorage.WriteResponse;

public class TestCompEngDatabaseAPI{

    @Test
    public void testLocation() throws Exception{
        Location mockLocation = Mockito.mock(Location.class);
        when(mockLocation.getLocationId()).thenReturn("mock_location_id");
        when(mockLocation.getLocationPath()).thenReturn("mock_location_path");

        Assertions.assertEquals("mock_location_id", mockLocation.getLocationId());
        Assertions.assertEquals("mock_location_path", mockLocation.getLocationPath());
    }

    @Test
    public void testData() throws Exception{
        Data mockData = Mockito.mock(Data.class);
        when(mockData.getDataId()).thenReturn("mock_data_id");
        when(mockData.getDataContent()).thenReturn(Arrays.asList(1, 10, 25));

        Assertions.assertEquals("mock_data_id", mockData.getDataId());
        Assertions.assertEquals(Arrays.asList(1, 10, 25), mockData.getDataContent());
    }

    @Test
    public void testWriteResponse() throws Exception{
        WriteResponse mockWriteResponse = Mockito.mock(WriteResponse.class);
        when(mockWriteResponse.getStatus()).thenReturn("mock_status");
        when(mockWriteResponse.getMessage()).thenReturn("mock_message");
        when(mockWriteResponse.getOutput()).thenReturn(Arrays.asList(1, 10, 25));

        Assertions.assertEquals("mock_status", mockWriteResponse.getStatus());
        Assertions.assertEquals("mock_message", mockWriteResponse.getMessage());
    }
    

   
   
}

