package project.api.compdatastoreapi.calculate;
import java.util.List;

public interface Data {
    // Define methods for data operations
    String getDataId();
    List<Integer> getDataContent();
    void setValue(int value);
}