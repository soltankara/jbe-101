package Module01.lesson10;

import Module01.lesson09.Classwork2;
import Module01.lesson09.Homework1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson09MethodsTest {
    @Test
    public void whenCallingSumUsingRecursion_ThenReturnCorrectResult() {
        int result = Classwork2.sumUsingRecursion(0);
        assertEquals(0, result);
    }

    @Test
    public void whenCallingSumUsingLoop_ThenReturnCorrectResult() {
        int result = Classwork2.sumUsingLoop(0);
        assertEquals(0, result);
    }

    @Test
    public void whenCallingSum_ThenReturnCorrectResult() {
        int result = Homework1.sum(2, 4, -1, 10);
        assertEquals(15, result);
    }

}
