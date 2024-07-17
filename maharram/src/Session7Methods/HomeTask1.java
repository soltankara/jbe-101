package Session7Methods;
import java.util.Scanner;
public class HomeTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of the numbers up to that number :");
        int number = sc.nextInt();
        int sumNumbersWithLoop = sumUsingLoop(number);
        System.out.println("the sum of the number up to number(with loop)  : " + sumNumbersWithLoop);
        int sumNumbersWithRecursion = sumUsingRecursion(number);
        System.out.println("the sum of the number up to number(with recursion)  : " + sumNumbersWithRecursion);
    }
    public static int sumUsingLoop(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumUsingRecursion(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number + sumUsingRecursion(number - 1);
        }
    }
}