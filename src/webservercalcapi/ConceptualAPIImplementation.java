package webservercalcapi;

import java.lang.annotation.Annotation;
import java.util.List;

import project.annotations.ConceptualAPI;

public class ConceptualAPIImplementation implements ConceptualAPI {

  
    public List<Integer> process(List<Integer> readData) {
        if (readData == null) {
            return List.of(); // Return an empty list if input is null
        }
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}