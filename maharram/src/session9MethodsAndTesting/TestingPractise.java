package session9MethodsAndTesting;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class TestingPractise {
    public static void main(String[] args) {
    }
    @Test
    public void whenCallingSumWithLoop_ThenReturnTrueResult() {
        int result = MethodsPractise.sumUsingLoop(4);
        assertEquals(10, result);
    }
    @Test
    public void whenCallingSumWithLoop_ThenReturnFalseResult() {
        int result = MethodsPractise.sumUsingLoop(4);
        assertNotEquals(11, result);
    }

    //---------------------------------------------------------------------
    @Test
    public void whenCallingSumWithRecursion_ThenReturnTrueResult() {
        int result = MethodsPractise.sumUsingRecursion(5);
        assertEquals(15, result);
    }
    @Test
    public void whenCallingSumWithRecursion_ThenReturnFalseResult() {
        int result = MethodsPractise.sumUsingRecursion(5);
        assertNotEquals(16, result);
    }
    //-----------------------------------------------------------------------
    @Test
    public void WhenCallingSum_ThenRetrunTrueResult() {
        int result = MethodsPractise.sum(1, 2, 3, 4, 5, 6);
        assertEquals(21, result);
    }
    @Test
    public void WhenCallingSum_ThenRetrunFalseResult() {
        int result = MethodsPractise.sum(1, 2, 3, 4, 5, 6);
        assertNotEquals(22, result);
    }
}