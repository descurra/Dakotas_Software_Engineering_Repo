package compdatastoreapi.datastorage;
import java.util.List;

public interface WriteResponse{
    List<Integer> getOutput();
    String getMessage();
    String getStatus();
    
}