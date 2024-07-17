package turqut.src;

import java.util.Arrays;

public class TurqutMethodsHomeWork1 {
    public static void main(String[] args) {
        System.out.println(sumAllWithRecursion(3, 5, 7));

    }

    public static int sumAllWithRecursion(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        return numbers[0] + sumAllWithRecursion(Arrays.copyOfRange(numbers, 1, numbers.length));
    }

}
