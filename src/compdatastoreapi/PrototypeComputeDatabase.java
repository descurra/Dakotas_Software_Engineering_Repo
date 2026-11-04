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
    @ProcessAPIPrototype
    public void prototype(ComputeDatabaseAPI api, Location readIn, Data writeOut){

        //Read from user specified input
        List<Integer> readUserInput = data.readData(readIn);

        //Write from user specified input
        WriteResponse writeUserInput = data.writeData(writeOut);

    }

    private ComputeDatabaseAPI data; //Data being read in and written

    public PrototypeComputeDatabase(ComputeDatabaseAPI data){
        this.data = data;
    }
    
}