package session8;

public class Homework3 {
    public static void main(String... args) {
        System.out.println(reverse(-2312));
    }

    //LeetCode 7.Reverse Integer
    public static int reverse(int x) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            String prefix = "";
            if (sb.charAt(0) == '-') {
                prefix = "-";
                sb.deleteCharAt(0);
            }
            sb.reverse();
            return Integer.parseInt(prefix + sb);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

