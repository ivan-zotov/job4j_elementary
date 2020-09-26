package u.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax7to4Then7() {
        int result = Max.max(7, 2);
        assertEquals(result, 7);
    }

    @Test
    public void whenMax4to2Then2() {
        int result = Max.max(2, 4);
        assertEquals(result, 4);
    }

    @Test
    public void whenEqualsThen4() {
        int result = Max.max(4, 4);
        assertEquals(result, 4);
    }
}