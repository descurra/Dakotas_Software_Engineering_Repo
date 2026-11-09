package compdatastoreapi;

import java.lang.annotation.Annotation;
import java.util.List;

import compdatastoreapi.calculate.Location;
import compdatastoreapi.datastorage.WriteResponse;
import project.annotations.ProcessAPI;

public class ProcessAPIImplementation implements ProcessAPI {

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

    @Override
    public List<Integer> readData(Location read) {
        // Implement logic to read integers from the specified input location
        // For example, read from a file or database
        return null; // Replace with actual implementation
    }


}