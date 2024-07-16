package Session7Methods;
import java.util.Scanner;
public class HomeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" how many numbers do you wnat to enter : ");
        int sizeOfNumber = sc.nextInt();
        int[] array = new int[sizeOfNumber];
        System.out.println("enter numbers for sum ");
        for (int i = 0; i < sizeOfNumber; i++) {
            System.out.print("number " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        int sumOfNumbers = sum(array, 0);
        System.out.println("The sum of the numbers :" + sumOfNumbers);
    }
    public static int sum(int[] arr, int num) {
        if (num >= arr.length) {
            return 0;
        } else {
            return arr[num] + sum(arr, num + 1);
        }
    }
}
