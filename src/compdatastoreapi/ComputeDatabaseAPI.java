package compdatastoreapi;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface ComputeDatabaseAPI {
    ReadRequest readData(ReadRequest request);
    WriteResponse writeData(WriteRequest request);
    
//only need read and write
//reading from location
}