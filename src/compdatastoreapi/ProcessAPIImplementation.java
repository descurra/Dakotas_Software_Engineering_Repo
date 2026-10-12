package compdatastoreapi;

import java.lang.annotation.Annotation;
import java.util.List;

import project.annotations.ProcessAPI;

public class ProcessAPIImplementation implements ProcessAPI {

    public List<Integer> read(Object inputConfig) {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}