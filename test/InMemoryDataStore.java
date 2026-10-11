import java.util.List;

import compdatastoreapi.datastorage.DataStorage;
import configurations.InputConfig;
import configurations.OutputConfig;

public class InMemoryDataStore implements DataStorage{
    @Override
    public List<Integer> read(InputConfig inputConfig) {
        return inputConfig.getData();
    }

    @Override
    public boolean write(OutputConfig outputConfig, List<String> data) {
        if (outputConfig == null || outputConfig.getDataOutput() == null) {
            return false;
        }else{
        return true;}
    }

}