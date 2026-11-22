package project.checkpointtests;
import java.util.List;

import configurations.InputConfig;

public class InMemoryInputConfig implements InputConfig{
    private final List<Integer> data;
    private String input;

    public InMemoryInputConfig(List<Integer> data) {
        this.data = data;
    }

    public InMemoryInputConfig(String input) {
        this.data = null;
        this.input = input;
    }

    @Override
    public List<Integer> getData() {
        return this.data;
    }


}