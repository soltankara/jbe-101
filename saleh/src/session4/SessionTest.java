package session4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SessionTest {

    @Test
    public void whenCallingHomeWork4() {
        int rs = Homework4.calculator('*', 10, 20);
        assertEquals(200, rs);
    }


}
