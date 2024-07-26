package az.perfect.session8two;

import az.perfect.session8.LessonHomeWork;
import az.perfect.session8.LessonHomeWork2;
import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Connection;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MethodsPracticesClass {


    Calculator calculator;

    @Test
    public void stringTesting() {
        String s1 = "hello";
        String s2 = "hello";
        assertEquals(s1, s2);
    }

    @Before
    public void setUp() {
        System.out.println("Before method");
    }

    @After
    public void testMethod() {
        System.out.println("After method");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }


    @Test
    public void addItionTesting() {
        Calculator calculator1=new Calculator();
        int result = calculator1.addition(5, 9);
        assertEquals(result, 14);
    }

    @Test
    public void assertCondition() {
        int a = 10;
        int b = 7;
        assertTrue(a > b);

    }

    @Test
    public void stringNotNull() {
        String text = "This is a text";
        assertNotNull(text);

    }

    @Test
    public void isTrueTesting() {
        boolean istrue = true;
        assertTrue(istrue);

    }

    @Test
    public void arrayLengTesting() {
        int arr[] = {5, 4, 7, 9, 45, 6, 78};
        int length = arr.length;
        assertEquals(7, length);
    }


}
