import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static Map<Integer, Integer> countElements(List<Integer> data) {
        Map<Integer, Integer> result = new HashMap<>();

        for (Integer element : data) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1);
            } else {
                result.put(element, 1);
            }
        }
        return result;
    }
}