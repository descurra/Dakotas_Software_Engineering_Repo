import java.util.ArrayList;
import java.util.List;

import configurations.OutputConfig;

public class InMemoryOutputConfig implements OutputConfig{
    private final List<String> dataOutput;

    public InMemoryOutputConfig(){
        this.dataOutput = new ArrayList<>();
    }

    public InMemoryOutputConfig(List<String> dataOutput) {
        this.dataOutput = dataOutput;
    }

    @Override
    public List<String> getDataOutput() {
        return dataOutput;
    }


}