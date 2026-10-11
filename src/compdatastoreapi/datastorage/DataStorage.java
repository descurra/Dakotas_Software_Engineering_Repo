package compdatastoreapi.datastorage;
import java.util.List;

import configurations.InputConfig;
import configurations.OutputConfig;


public interface DataStorage{
    List<Integer> read(InputConfig inputConfig);
    boolean write(OutputConfig outputConfig, List<String> data);
}