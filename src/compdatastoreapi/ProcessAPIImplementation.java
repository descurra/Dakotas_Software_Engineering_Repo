package compdatastoreapi;

import java.util.List;

import compdatastoreapi.calculate.Data;
import compdatastoreapi.calculate.Location;
import compdatastoreapi.datastorage.WriteResponse;


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

    /*
    // 1) Read in data
    public List<Integer> readInput(Location read) {
        // Implement logic to read integers from the specified input location
        // For example, read from a file or database
        return null; // Replace with actual implementation
        
    }


    // 2) Write to user spcified location
    public WriteResponse writeOutput(Location write, List<Integer> data) {
        // Implement logic to write integers to the specified output location
        // For example, write to a file or database
        return null; // Replace with actual implementation
    }
    */


}