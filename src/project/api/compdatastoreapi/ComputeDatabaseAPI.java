package project.api.compdatastoreapi;
import java.util.List;

import configurations.InputConfig;
import configurations.OutputConfig;
import project.annotations.ProcessAPI;
import project.api.compdatastoreapi.calculate.Data;
import project.api.compdatastoreapi.calculate.Location;
import project.api.compdatastoreapi.datastorage.WriteResponse;

@ProcessAPI
public interface ComputeDatabaseAPI {
    List<Integer> readData(Location read);
    WriteResponse writeData(Data write);
    List<Integer> read(InputConfig inputConfig);
    boolean write(OutputConfig outputConfig, List<String> data);
    
//only need read and write
//reading from location
}