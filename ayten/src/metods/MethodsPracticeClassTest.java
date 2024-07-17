package metods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodsPracticeClassTest {

    @Test
    public void whenReverse_ThenReturnCorrectResult() {
        String result = Practice.reverseme("turing");
        assertEquals("gnirut", result);
    }
    @Test
    public void whenCallingSum_ThenRetunResult() {
        String res = Practice.reverseme("");
        assertEquals("", res);
    }

}

