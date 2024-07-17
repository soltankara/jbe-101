package turqut.src;

import org.junit.*;

import static org.junit.Assert.*;

public class TurqutTestingHomeWork3String {

    @Test
    public void testStringTask1() {
        assertEquals("hello", TurqutMethodsHomeWork2String.StringTask1("HELLO"));
    }

    @Test
    public void testStringTask2() {
        char[] result = TurqutMethodsHomeWork2String.StringTask2("hello");
        assertArrayEquals("olleh".toCharArray(), result);
    }

    @Test
    public void testStringTask3() {
        assertEquals("55", TurqutMethodsHomeWork2String.StringTask3("1111111111", 5));
    }
}
