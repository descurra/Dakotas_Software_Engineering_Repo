package project.api.compdatastoreapi;
import java.util.List;

import project.annotations.ProcessAPI;
import project.api.compdatastoreapi.calculate.Data;
import project.api.compdatastoreapi.calculate.Location;
import project.api.compdatastoreapi.datastorage.WriteResponse;

@ProcessAPI
public interface ComputeDatabaseAPI {
    List<Integer> readData(Location read);
    WriteResponse writeData(Data write);
    
//only need read and write
//reading from location
}