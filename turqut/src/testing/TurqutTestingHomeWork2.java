package turqut.src.testing;

import org.junit.Test;
import turqut.src.methods.TurqutMethodsHomeWork1;

import static org.junit.Assert.*;

public class TurqutTestingHomeWork2 {

    @Test
    public void testSumAllWithRecursion() {
        assertEquals(15, TurqutMethodsHomeWork1.sumAllWithRecursion(3, 5, 7));
    }
}
