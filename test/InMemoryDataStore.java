import java.util.List;

import configurations.InputConfig;
import configurations.OutputConfig;
import project.api.compdatastoreapi.datastorage.DataStorage;

public class InMemoryDataStore implements DataStorage{

    public InMemoryDataStore() {
    }
    @Override
    public List<Integer> read(InputConfig inputConfig) {
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

}