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
        int[] arr = new int[number];
        for (int i = 0 ; i <= number-1; i++) {
            arr[i] = i+1;
        }
        return Arrays.stream(arr).sum();
    }
}
