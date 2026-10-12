package usercomputeengineapi;

import java.lang.annotation.Annotation;
import java.util.List;

import project.annotations.NetworkAPI;

public class NetworkAPIImplementation implements NetworkAPI {

    public List<Integer> read(Object inputConfig) {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}