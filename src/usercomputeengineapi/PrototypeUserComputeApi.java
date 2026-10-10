//API 1
//USER <--> COMPUTE ENGINE
//USER = FRONT END 
//COMPUTE ENGINE = BACK END 

package usercomputeengineapi;
import project.annotations.NetworkAPIPrototype;

public class PrototypeUserComputeApi{
    @NetworkAPIPrototype
    public void prototype(UserComputeAPI api){
        //Specify source for input
        String inputSpource = "mock_input_source";

        //Delimeter charactaers for output
        char delimeter = ',';

        //Specify destination for output
        String outputDestination = "mock_output";
    }
    
}
