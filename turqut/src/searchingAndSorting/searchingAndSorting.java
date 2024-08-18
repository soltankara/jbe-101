package searchingAndSorting;

import java.util.Arrays;
import java.util.Comparator;

public class searchingAndSorting {
    public static void main(String[] args) {

    }

    //3110. Score of a String - Easy
    public static int scoreOfString(String s) {
        int score = 0;
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            score += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }
        return score;
    }

    //2469. Convert the Temperature - Easy
    public static double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.8 + 32.0;
        return ans;
    }

    //1108. Defanging an IP Adress - Easy
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //2894. Divisible and Non-divisible Sums Difference - Easy
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            }
        }
        return num1 - num2;
    }

    //2798. Number of Employees Who Met the Target - Easy
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }

    //2807. Insert Greatest Common Divisors in Linked List - Medium
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);

            ListNode gcdNode = new ListNode(gcdValue);

            gcdNode.next = current.next;
            current.next = gcdNode;

            current = gcdNode.next;
        }

        return head;
    }

    //Helper method for 2807
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //2396. Strictly Palindromic Number - Medium
    public static boolean isStrictlyPalindromic(int n) {
        return false;
    }
    /* Explanation : If we enter 4 and a number greater than 4 as input, we will get false.
    Because all n numbers greater than 4 are written in the n-2 system in the form
    of "12", which is not a polindrome. If we simply apply this rule to the number 4,
    then we get the answer "100" in the n-2 system, which is not a polindrome. */

    //2545. Sort the Students by Their Kth Score - Medium
    public static int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row2[k], row1[k]);
            }
        });
        return score;
    }

    //41. First Missing Positive - Hard
    public static int firstMissingPositive(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0 && nums[i] <= l && nums[i] != i + 1) {
                int v = nums[i];
                nums[i] = -1;
                replace(v, nums);
            }
        }

        for (int i = 0; i < l; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return l + 1;
    }

    public static void replace(int i, int[] nums) {
        int l = nums.length;
        if (i > 0 && i <= l && i != nums[i - 1]) {
            int v = nums[i - 1];
            nums[i - 1] = i;
            replace(v, nums);
        }
    }

    //4. Median of Two Sorted Arrays - Hard
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        if (merged.length % 2 == 1) {
            return merged[merged.length / 2];
        } else {
            int mid = merged.length / 2;
            return (merged[mid - 1] + merged[mid]) / 2.0;
        }
    }

}


//Class for 2807
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
