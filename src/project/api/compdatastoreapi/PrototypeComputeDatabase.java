//API 2
//COMPUTE ENGINE <--> DATABASE
//COMPUTE ENGINE = FRONT END 
//DATA STORAGE = BACK END 

package project.api.compdatastoreapi;
import java.util.List;

import project.annotations.ProcessAPIPrototype;
import project.api.compdatastoreapi.calculate.Data;
import project.api.compdatastoreapi.calculate.Location;
import project.api.compdatastoreapi.datastorage.WriteResponse;

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