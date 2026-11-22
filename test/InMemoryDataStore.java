import java.util.Collections;
import java.util.List;

import configurations.InputConfig;
import configurations.OutputConfig;
import project.api.compdatastoreapi.ComputeDatabaseAPI;
import project.api.compdatastoreapi.calculate.Data;
import project.api.compdatastoreapi.calculate.Location;
import project.api.compdatastoreapi.datastorage.DataStorage;
import project.api.compdatastoreapi.datastorage.WriteResponse;

public class InMemoryDataStore implements ComputeDatabaseAPI{

    public InMemoryDataStore() {
    }
    @Override
    public List<Integer> read(InputConfig inputConfig) {
        if (inputConfig == null || inputConfig.getData() == null) {
            return Collections.emptyList();
        }
        return inputConfig.getData();    
    }

    @Override
    public boolean write(OutputConfig outputConfig, List<String> data) {
        if(outputConfig == null || outputConfig.getDataOutput() == null) {
            return false;
        }else{
        return true;
        }
    }
    @Override
    public List<Integer> readData(Location read) {
        return null;
       
    }
    @Override
    public WriteResponse writeData(Data write) {
        return null;
        
    }

}