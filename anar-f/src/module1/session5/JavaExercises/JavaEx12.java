package module1.session5.JavaExercises;
import java.util.Scanner;
public class JavaEx12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 numbers: ");
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum+=arr[i];
        }
        float avg = sum/5;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);
    }
}
