package session8;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //7. Reverse Integer
        System.out.print("Enter the number: ");
        int number1 = scan.nextInt();
        System.out.println(reverse(number1));
        //9. Palindrome Number
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        System.out.println(isPalindrome(number));
        //13. Roman to Integer
        String s1 = "XII";
        System.out.println("roman to int: " + romanToInt(s1));
        //29. Divide Two Integers
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
        //48. Rotate Image
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        //50. Pow(x, n)
        double x = 2.0;
        int n = 10;
        System.out.println(pow(x, n));
        //66. Plus One
        int[] digits = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits)));
        //69. Sqrt(x)
        System.out.println("Enter number: ");
        int x1 = scan.nextInt();
        System.out.println(mySqrt(x1));
        //70. Climbing Stairs
        System.out.println("Enter step: ");
        int stairs = scan.nextInt();
        System.out.println(climbStairs(stairs));
    }

    static int reverse(int number1) {
        int k;
        for (k = 0; number1 != 0; number1 /= 10) {
            k = k * 10 + number1 % 10;
        }
        return k;
    }

    static boolean isPalindrome(int number) {
        int n = number;
        int k;
        for (k = 0; n > 0; n /= 10) {
            k = k * 10 + n % 10;
        }

        return k == number;
    }

    static int divide(int dividend, int divisor) {
        return dividend == Integer.MIN_VALUE && divisor == -1 ? Integer.MAX_VALUE : dividend / divisor;
    }

    static void rotate(int[][] matrix) {
        int n = matrix.length;
        int i;
        int j;
        int temp;
        for (i = 0; i < n; ++i) {
            for (j = i; j < n; ++j) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (i = 0; i < n; ++i) {
            for (j = 0; j < n / 2; ++j) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                int var10002 = digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    static double pow(double x, int n) {
        return Math.pow(x, (double) n);
    }

    static int mySqrt(int x1) {
        return (int) Math.sqrt((double) x1);
    }

    static int climbStairs(int stairs) {
        int[] arr = new int[stairs];
        if (stairs == 1) {
            return 1;
        } else if (stairs == 2) {
            return 2;
        } else {
            arr[0] = 1;
            arr[1] = 2;

            for (int i = 2; i < stairs; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

            return arr[stairs - 1];
        }
    }

    static int romanToInt(String s1) {
        int total = 0, prevValue = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            int currentValue = 0;
            switch (s1.charAt(i)) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }

}
