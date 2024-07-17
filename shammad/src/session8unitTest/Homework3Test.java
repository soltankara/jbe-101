package session8unitTest;

import org.junit.Test;
import session8.Homework3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Homework3Test {
    @Test
    public void reverseIntegerTest() {
        assertEquals(132, Homework3.reverse(231));
    }
    @Test
    public void reverseIntegerTest2() {
        assertNotEquals(123, Homework3.reverse(123));
    }
}
