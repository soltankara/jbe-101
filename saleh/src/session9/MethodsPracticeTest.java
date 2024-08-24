package session9;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MethodsPracticeTest {

    @Before
    public void setUp() {
        System.out.println("I am in Before.");
    }

    @AfterClass
    public static void destroy() {
        System.out.println("I am in @AfterClass.");
    }

    @Test
    public void whenCallingSum_ThenReturnCorrectAnswer() {
        int result = Practice.sum(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void whenCallingSum_ThenReturnFalseResult() {
        int result = Practice.sum(1, 2);
        assertNotEquals(4, result);
    }
}
