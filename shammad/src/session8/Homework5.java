package session8;

public class Homework5 {
    public static void main(String... args) {
        System.out.println(isPalindrome(123));
    }

    //LeetCode 9. Palindrome Number
    public static boolean isPalindrome(int x) {
        try {
            String s = String.valueOf(x);
            StringBuilder sb = new StringBuilder(s);
            if (sb.charAt(0) == '-') {
                return false;
            }
            sb.reverse();
            return s.equals(sb.toString());
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

