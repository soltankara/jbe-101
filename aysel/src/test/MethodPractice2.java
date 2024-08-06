package test;


import org.junit.Test;
import session5.Methods2;

import static junit.framework.TestCase.assertEquals;

public class MethodPractice2 {
    @Test
    public void WhenCallingMinimum_ThenReturnCorrectResult(){
        assertEquals(Methods2.minimum(2,5));
    }

    private void  assertEquals(int minimum) {
    }


}
