package compdatastoreapi;
import java.util.List;

import compdatastoreapi.calculate.Data;
import compdatastoreapi.calculate.Location;
import compdatastoreapi.datastorage.WriteResponse;
import project.annotations.ProcessAPI;

@ProcessAPI
public interface ComputeDatabaseAPI {
    List<Integer> readData(Location read);
    WriteResponse writeData(Data write);
    
//only need read and write
//reading from location
}