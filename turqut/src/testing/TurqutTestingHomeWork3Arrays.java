package turqut.src.testing;

import org.junit.*;
import turqut.src.methods.TurqutMethodsHomeWork2Arrays;

import static org.junit.Assert.*;

public class TurqutTestingHomeWork3Arrays {

    @Test
    public void testArrayTask1() {
        String expectedOutput = "[4, 5, 4, 5]";
        String actualOutput = TurqutMethodsHomeWork2Arrays.ArrayTask1(new int[]{4, 5});
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testArrayTask2() {
        assertEquals(90, TurqutMethodsHomeWork2Arrays.ArrayTask2(new int[]{10, 20, 30, 40}));
    }

    @Test
    public void testArrayTask3() {
        assertArrayEquals(new int[]{1, 3, 6, 10}, TurqutMethodsHomeWork2Arrays.ArrayTask3(new int[]{1, 2, 3, 4}));
    }
}
