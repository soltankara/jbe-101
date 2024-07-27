package Module01.lesson10;

import Module01.lesson09.Practice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MethodsPracticeClassTest {
    @Before
    public void set() {
        System.out.println("I am in @Before");
    }

    @Test
    public void whenCallingSum_ThenReturnCorrectResult() {
        int result = Practice.sum(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void whenCallingSum_ThenReturnFalseResult() {
        int result = Practice.sum(1, 2);
        assertNotEquals(4, result);
    }

    @Test
    public void whenCallingReverse_ThenReturnCorrectResult() {
        String result = Practice.reverse("adil");
        assertEquals("lida", result);
    }

    @Test
    public void whenCallingReverse_ThenReturnFalseResult() {
        String result = Practice.reverse("");
        assertEquals("", result);
    }


}
