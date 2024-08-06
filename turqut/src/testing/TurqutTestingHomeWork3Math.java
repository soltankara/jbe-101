package turqut.src.testing;

import org.junit.Test;
import turqut.src.methods.TurqutMethodsHomeWork2Math;

import java.io.*;

import static org.junit.Assert.*;

public class TurqutTestingHomeWork3Math {

    @Test
    public void testMathTask1() {
        assertEquals(8, TurqutMethodsHomeWork2Math.MathTask1(3, 5));
    }

    @Test
    public void testMathTask2() {
        assertEquals(0, TurqutMethodsHomeWork2Math.MathTask2(123));
    }

    @Test
    public void testMathTask3() {
        assertEquals(3, TurqutMethodsHomeWork2Math.MathTask3(124));
    }

    @Test
    public void testMathTask4() {
        assertNotEquals(4, TurqutMethodsHomeWork2Math.MathTask4(1, 99));
    }

    @Test
    public void testMathTask5() {
        assertEquals(6, TurqutMethodsHomeWork2Math.MathTask5(37));
    }

    @Test
    public void testMathTask6() {
        assertEquals(6, TurqutMethodsHomeWork2Math.MathTask6(6));
    }

    @Test
    public void testMathTask7() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "1 2 3 4 5 6 7 8 9 11 12 15 22 ";
        TurqutMethodsHomeWork2Math.MathTask7(1, 22);
        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testMathTask8() {
        assertNotEquals(7, TurqutMethodsHomeWork2Math.MathTask8(3));
    }

    @Test
    public void testMathTask9() {
        assertEquals(13, TurqutMethodsHomeWork2Math.MathTask9(9, 3));
    }

    @Test
    public void testMathTask10() {
        assertNotEquals(12, TurqutMethodsHomeWork2Math.MathTask10("AB"));
    }
}
