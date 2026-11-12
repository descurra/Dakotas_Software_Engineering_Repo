package webservercalcapi;

import java.util.List;

import webservercalcapi.calculate.Solution;
import webservercalcapi.webserver.Comp;

public class ConceptualAPIImplementation implements WebCalculateAPI{
    private final WebCalculateAPI conceptualAPI;

    public ConceptualAPIImplementation(WebCalculateAPI conceptualAPI) {
        this.conceptualAPI = conceptualAPI;
    }

  
    public List<Integer> process(List<Integer> readData) {
        if (readData == null) {
            return List.of(); // Return an empty list if input is null
        }
        return null;
    }

    //3) Pass intergers to  ConceptualAPI implementation
    @Override
    public Solution computeResult(Comp cal) {
        return conceptualAPI.computeResult(cal);

    }

    

}