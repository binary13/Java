import java.util.ArrayList;
import java.util.List;

/**
 * Created by justin on 3/16/2016.
 */
public interface ISavable {
    void write();
    void read(List<String> savedValues);
}
