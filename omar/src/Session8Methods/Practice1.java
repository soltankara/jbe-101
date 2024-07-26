package Session8Methods;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // Exercise-Valid anagram
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        isAnagram(a, b);
    }

    public static boolean isAnagram(String a, String b) {
        char[] arr = a.toCharArray();
        char[] arr2 = b.toCharArray();
        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;

            }


        }


        return true;
    }
}
