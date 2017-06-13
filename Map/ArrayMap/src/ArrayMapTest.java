/**
 * Created by lanqingy on 6/13/17.
 */

import org.junit.Assert;

public class ArrayMapTest {

    public static void testSize() {
        ArrayMap<String, Integer> map = new ArrayMap<>();
        map.put("apple", 5);
        map.put("orange", 10);
        int expected = 2;
        Assert.assertEquals(expected, map.size());
    }

    public static void main(String[] args) {
        testSize();
    }
}
