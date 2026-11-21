package project.api.compdatastoreapi;

import java.util.List;

import configurations.InputConfig;
import configurations.OutputConfig;
import project.api.compdatastoreapi.calculate.Data;
import project.api.compdatastoreapi.calculate.Location;
import project.api.compdatastoreapi.datastorage.WriteResponse;


public class ProcessAPIImplementation implements ComputeDatabaseAPI {
    private final ComputeDatabaseAPI processAPI;

    public ProcessAPIImplementation(ComputeDatabaseAPI processAPI) {
        this.processAPI = processAPI;
    }

    
    // Request ProcessAPI implementation to write output
    //Write to user specified location
    @Override
    public WriteResponse writeData(Data write) {
        return processAPI.writeData(write);
    }

    //put in process api implementations


    //Read in data
    @Override
    public List<Integer> readData(Location read) {
        return processAPI.readData(read);
    }


    @Override
    public List<Integer> read(InputConfig inputConfig) {
        return processAPI.read(inputConfig);

    }


    @Override
    public boolean write(OutputConfig outputConfig, List<String> data) {
        return processAPI.write(outputConfig, data);

    }



}