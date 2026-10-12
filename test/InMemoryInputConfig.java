import java.util.List;

import configurations.InputConfig;

public class InMemoryInputConfig implements InputConfig{
    private final List<Integer> data;

    public InMemoryInputConfig(List<Integer> data) {
        this.data = data;
    }

    @Override
    public List<Integer> getData() {
        return data;
    }


}