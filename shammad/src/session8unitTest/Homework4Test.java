package session8unitTest;

import org.junit.Test;
import session8.Homework4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class Homework4Test {
    @Test
    public void isPalindromeTest() {
        assertEquals(true,Homework4.isPalindrome(12321));
    }

    @Test
    public void isPalindromeTest2() {
        assertNotEquals(true,Homework4.isPalindrome(91));
    }
}
