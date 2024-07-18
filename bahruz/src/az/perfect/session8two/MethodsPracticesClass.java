package az.perfect.session8two;

import az.perfect.session8.LessonHomeWork;
import az.perfect.session8.LessonHomeWork2;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.Scanner;

import static org.junit.Assert.*;

public class MethodsPracticesClass {


    @Test
    public void stringTesting() {
        String s1 = "hello";
        String s2 = "hello";
        assertEquals(s1, s2);
    }

    @BeforeEach
    public void setUp() {
        Calculator calculator = new Calculator();
    }

    @AfterEach
    public void testMethod() {
        System.out.println("AfterEach method");
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
        Calculator calculator = new Calculator();
        int result = calculator.addition(5, 9);
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

}
