//9 . Palindrome Number
package Session17_Leetcode.Easy;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter a number(if your number is palindrome you will see (true) ) :");
            Integer number = sc.nextInt();
            System.out.println(PalindromeNumber.isPalindrome(number));
        }
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int halfNumber = 0;
        while (x > halfNumber) {
            halfNumber = halfNumber * 10 + x % 10;
            x /= 10;
        }
        return x == halfNumber || x == halfNumber / 10;
    }
}