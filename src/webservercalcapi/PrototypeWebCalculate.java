//API 3
//WEB SERVER <--> CALCULATE
//WEB SERVER = FRONT END 
//CALCULATE = BACK END 
//WITHIN COMPUTE ENGINE

package webservercalcapi;
import project.annotations.ConceptualAPIPrototype;

public class PrototypeWebCalculate{

    @ConceptualAPIPrototype
    public void prototype(WebCalculateAPI api){
        
        int mockInput = 0;
        
        String mockResult = api.computeResult(mockInput);
        

    }

}