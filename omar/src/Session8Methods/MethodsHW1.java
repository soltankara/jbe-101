package Session8Methods;

import java.util.Arrays;

public class MethodsHW1 {
    public static void main(String[] args) {
        int number = 5;
        int SumWithLoop = SumWithLoop(number);
        int SumWithRecursive = SumWithRecursive(number);
        System.out.println("Sum with loop: " + SumWithLoop);
        System.out.println("Sum with recursive: " + SumWithRecursive);
    }
    public static int SumWithLoop(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int SumWithRecursive(int number ) {
        int[] arr = {1,2,3,4,5};
       
        return arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
    }
}
