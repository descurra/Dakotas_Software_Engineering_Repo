package project.checkpointtests;
import java.util.ArrayList;
import java.util.List;

import configurations.OutputConfig;

public class InMemoryOutputConfig implements OutputConfig{
    private final List<String> dataOutput;
    private String output;

    public InMemoryOutputConfig(){
        this.dataOutput = new ArrayList<>();
    }

    public InMemoryOutputConfig(List<String> dataOutput) {
        this.dataOutput = dataOutput;
    }

    public InMemoryOutputConfig(String output) {
        this.dataOutput = null;
        this.output = output;
    }

    @Override
    public List<String> getDataOutput() {
        return this.dataOutput;
    }


}