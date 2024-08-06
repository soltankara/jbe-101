package turqut.src.testing;

import org.junit.Test;
import turqut.src.methods.TurqutMethodsClassWork1AsHomeWork;

import static org.junit.Assert.*;

public class TurqutTestingHomeWork1 {

    @Test
    public void testSumWithLoop() {
        assertEquals(10, TurqutMethodsClassWork1AsHomeWork.sumWithLoop(5));
    }

    @Test
    public void testSumWithRecursion() {
        assertEquals(10, TurqutMethodsClassWork1AsHomeWork.sumWithRecursion(5));
    }

}