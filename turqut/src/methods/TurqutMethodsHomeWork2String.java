package turqut.src.methods;

import java.util.Scanner;

/*
I solve 3 problems in LeetCode String section. You can see the names of tasks in the comment.
And I to name the names of methods according to number of task.
 */

public class TurqutMethodsHomeWork2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //StringTask1 - To LowerCase
        System.out.print("s: ");
        String str1 = sc.nextLine();
        System.out.println(StringTask1(str1));

        //StringTask2 - Reverse String
        System.out.print("s: ");
        String str2 = "hello";
        System.out.println(StringTask2(str2));

        //StringTask3 - Calculate Digit Sum of String
        System.out.print("s: ");
        String str3 = sc.nextLine();
        System.out.print("k: ");
        int k = sc.nextInt();
        System.out.println(StringTask3(str3, k));

    }

    public static String StringTask1(String s) {
        return s.toLowerCase();
    }

    public static char[] StringTask2(String s) {
        StringBuilder sb = new StringBuilder(s);
        String result = sb.reverse().toString();
        return result.toCharArray();
    }

    public static String StringTask3(String s, int k) {
        while (s.length() > k) {
            StringBuilder newS = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }
                newS.append(sum);
            }
            s = newS.toString();
        }
        return s;
    }
}
