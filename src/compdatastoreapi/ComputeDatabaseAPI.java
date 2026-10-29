package compdatastoreapi;
import java.util.List;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface ComputeDatabaseAPI {
    List<Integer> readData(Location read);
    WriteRequest writeData(Data write);
    
//only need read and write
//reading from location
}