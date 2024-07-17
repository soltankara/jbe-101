package session8unitTest;

import org.junit.Test;
import session8.Homework2;

import static org.junit.Assert.assertEquals;

public class Homework2Test {
    @Test
    public void sumUsingRecursionWithVarArgsTest() {
        assertEquals(3,Homework2.sum(1,2));
    }
    @Test
    public void sumUsingRecursionWithVarArgsTest2() {
        assertEquals(6,Homework2.sum(1,2,3));
    }
    @Test
    public void sumUsingRecursionWithVarArgsTest3() {
        assertEquals(10,Homework2.sum(1,2,3,4));
    }
}
