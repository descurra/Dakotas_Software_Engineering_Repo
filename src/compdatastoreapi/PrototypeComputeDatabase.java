//API 2
//COMPUTE ENGINE <--> DATABASE
//COMPUTE ENGINE = FRONT END 
//DATA STORAGE = BACK END 

package compdatastoreapi;
import java.util.List;

import compdatastoreapi.calculate.Data;
import compdatastoreapi.calculate.Location;
import compdatastoreapi.datastorage.WriteResponse;
import project.annotations.ProcessAPIPrototype;

public class PrototypeComputeDatabase{

    public PrototypeComputeDatabase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @ProcessAPIPrototype
    public void prototype(ComputeDatabaseAPI api){
        Location readIn = null;

        //Read from user specified input
        List<Integer> readUserInput = api.readData(readIn);
        Data writeOut = null;

        //Write from user specified input
        WriteResponse writeUserInput = api.writeData(writeOut);

    }

    private ComputeDatabaseAPI data; //Data being read in and written

    public PrototypeComputeDatabase(ComputeDatabaseAPI data){ //Return type
        this.data = data;
    }
    
}