package session17;

public class Easy {
    public static void main(String[] args) {
        //258. Add Digits
        int num = 38;
        System.out.println("add digits: " + addDigits(num));
        //263. Ugly Number
        int n = 14;
        System.out.println("is ugly: " + isUgly(n));
        //268. Missing Number
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums));
        //283. Move Zeroes
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        //344. Reverse String
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);

    }

    public static int addDigits(int num) {
        return num % 9;
    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int realSum = 0;
        for (int i = 0; i < nums.length; i++) {
            realSum += nums[i];
        }
        return sum - realSum;
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println("Modified array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        System.out.println("Reversed string: ");
        System.out.print("[");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print("\"" + s[i] + "\"");
            if (i > 0) System.out.print(", ");
        }
        System.out.print("]");
    }
}
