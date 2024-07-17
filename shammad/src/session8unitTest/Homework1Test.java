package session8unitTest;

import org.junit.Test;
import session8.Homework1;

import static org.junit.Assert.assertEquals;

public class Homework1Test {
    @Test
    public void sumUsingLoopTest() {
        assertEquals(15, Homework1.sumUsingLoop(5));
    }

    @Test
    public void sumUsingRecursionTest() {
        assertEquals(15, Homework1.sumUsingRecursion(5));
    }
}
