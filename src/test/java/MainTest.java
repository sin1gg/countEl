import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testEmptyList() {
        List<Integer> data = List.of();
        Map<Integer, Integer> expected = new HashMap<>();

        Map<Integer, Integer> result = Main.countElements(data);

        assertEquals(expected, result);
    }

    @Test
    public void testSingleElementList() {
        List<Integer> data = List.of(1);
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 1);

        Map<Integer, Integer> result = Main.countElements(data);

        assertEquals(expected, result);
    }

    @Test
    public void testMultipleElements() {
        List<Integer> data = List.of(1, 3, 4, 5, 1, 5, 4, 4);
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(3, 1);
        expected.put(4, 3);
        expected.put(5, 2);

        Map<Integer, Integer> result = Main.countElements(data);

        assertEquals(expected, result);
    }
}

