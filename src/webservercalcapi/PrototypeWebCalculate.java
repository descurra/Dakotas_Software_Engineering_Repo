//API 3
//WEB SERVER <--> CALCULATE
//WEB SERVER = FRONT END 
//CALCULATE = BACK END 
//WITHIN COMPUTE ENGINE

package webservercalcapi;
import project.annotations.ConceptualAPIPrototype;

public class PrototypeWebCalculate{

    @ConceptualAPIPrototype
    public void prototype(Comp cal){
        Solution sol = compute.computeResult(cal);
        //sol takes in the compute object
        //Calls Solution object to return the computed result of the calculation
        

    }
    private WebCalculateAPI compute; //compute result of calculation

    public PrototypeWebCalculate(WebCalculateAPI compute){ //Return type
        this.compute = compute;
    }



}