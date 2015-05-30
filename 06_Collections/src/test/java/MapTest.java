import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map
 */
public class MapTest extends Assert {

    static Map<Class, Class> types = new TreeMap<>();

    static {
        types.put(Byte.TYPE, Byte.class);
        types.put(Short.TYPE, Short.class);
        types.put(Integer.TYPE, Integer.class);
        types.put(Long.TYPE, Long.class);
        types.put(Float.TYPE, Float.class);
        types.put(Double.TYPE, Double.class);
        types.put(Character.TYPE, Character.class);
        types.put(Boolean.TYPE, Boolean.class);
    }

    @Test
    @Ignore
    public void testMapOperations() {
        Map<String, String> map = new HashMap<>();

        assertTrue("Список пуст", map.isEmpty());

        map.put("Hi", "Привет");
        assertEquals(1, map.size());

        map.put("Size", "Размер");

        assertEquals("Привет", map.get("Hi"));
    }
}
