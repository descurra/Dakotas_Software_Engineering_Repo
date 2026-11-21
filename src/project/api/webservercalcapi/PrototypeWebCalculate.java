//API 3
//WEB SERVER <--> CALCULATE
//WEB SERVER = FRONT END 
//CALCULATE = BACK END 
//WITHIN COMPUTE ENGINE

package project.api.webservercalcapi;
import project.annotations.ConceptualAPIPrototype;
import project.api.webservercalcapi.calculate.Solution;
import project.api.webservercalcapi.webserver.Comp;

public class PrototypeWebCalculate{

    private WebCalculateAPI compute; //compute result of calculation

    public PrototypeWebCalculate(WebCalculateAPI compute){ //Return type
        this.compute = compute;
    }

    public PrototypeWebCalculate() {
       // throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @ConceptualAPIPrototype
    public void prototype(WebCalculateAPI api){
        if (api != null) {
            Comp cal = null; // new calculation request
            Solution sol = api.computeResult(cal);
        }

        //sol takes in the compute object
        //Calls Solution object to return the computed result of the calculation

    }

    



}