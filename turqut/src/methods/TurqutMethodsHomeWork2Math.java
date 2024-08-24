package turqut.src.methods;

import java.util.Scanner;

/*
I solve 10 problems in LeetCode Math section. You can see the names of tasks in the comment.
And I to name the names of methods according to number of task.
 */
public class TurqutMethodsHomeWork2Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //MathTask1 - Add Two Integers
        System.out.print("num1 = ");
        int num1 = sc.nextInt();
        System.out.print("num2 = ");
        int num2 = sc.nextInt();
        System.out.println(MathTask1(num1, num2));

        //MathTask2 - Subtract the Product and Sum of Digits of an Integer
        System.out.print("num = ");
        int n = sc.nextInt();
        System.out.println(MathTask2(n));

        //MathTask3 - Count The Digits That Divide a Number
        System.out.print("num = ");
        int num3 = sc.nextInt();
        System.out.println(MathTask3(num3));

        //MathTask4 - Count Symmetric Integers
        System.out.print("low = ");
        int low = sc.nextInt();
        System.out.print("high = ");
        int high = sc.nextInt();
        System.out.println(MathTask4(low, high));

        //MathTask5 - Sqrt(x)
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.println(MathTask5(x));

        //MathTask6 - Smallest Even Multiple
        System.out.print("n = ");
        int n6 = sc.nextInt();
        System.out.println(MathTask6(n6));

        //MathTask7 - Self Dividing Number
        System.out.print("left = ");
        int left = sc.nextInt();
        System.out.print("right = ");
        int right = sc.nextInt();
        MathTask7(left, right);

        //MathTask8 - Fibonacci Number
        System.out.print("n = ");
        int n8 = sc.nextInt();
        System.out.println(MathTask8(n8));

        //MathTask9 - Water Bottles
        System.out.print("numBottles = ");
        int numBottles = sc.nextInt();
        System.out.print("numExchange = ");
        int numExchange = sc.nextInt();
        System.out.println(MathTask9(numBottles, numExchange));

        //MathTask10 - Excel Sheet Column Number
        System.out.print("columnTitle = ");
        String columnTitle = sc.next();
        System.out.println(MathTask10(columnTitle));
    }

    public static int MathTask1(int num1, int num2) {
        return num1 + num2;
    }

    public static int MathTask2(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }

    public static int MathTask3(int num3) {
        int count = 0;
        int temp = num3;
        while (num3 > 0) {
            int digit = num3 % 10;
            if (digit != 0 && temp % digit == 0) {
                count++;
            }
            num3 /= 10;
        }
        return count;
    }

    public static int MathTask4(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            int digits = countDigits(i);
            if (digits % 2 == 0) {
                if (digits == 2 && checkTwoDigitPalindrome(i)) {
                    count++;
                } else if (digits == 4 && checkFourDigitSum(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static boolean checkTwoDigitPalindrome(int number) {
        int firstDigit = number / 10;
        int lastDigit = number % 10;
        return firstDigit == lastDigit;
    }

    public static boolean checkFourDigitSum(int number) {
        int a = number / 1000;
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;
        return (a + b) == (c + d);
    }

    public static int MathTask5(int x) {
        double sqrt = Math.sqrt(x);
        return (int) Math.floor(sqrt);
    }

    public static int MathTask6(int n6) {
        if (n6 % 2 == 0) {
            return n6;
        } else {
            return 2 * n6;
        }
    }

    public static void MathTask7(int left, int right) {
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isSelfDividingNumber(int num) {
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0 || temp % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static int MathTask8(int n8) {
        if (n8 == 0) {
            return 0;
        } else if (n8 == 1) {
            return 1;
        } else {
            int[] fib = new int[n8 + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n8; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib[n8];
        }
    }

    public static int MathTask9(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        return totalBottles;
    }

    public static int MathTask10(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int digit = (int) (columnTitle.charAt(i) - 'A' + 1);
            result = result * 26 + digit;
        }
        return result;
    }
}