package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String str = scanner.nextLine();
        if (str.length() > 1) System.out.println("ERROR");
        else {
            char ch = str.charAt(0);
            String result;
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) result = "Vowel";
                else result = "Consonant";
                System.out.println("Input letter is " + result);
            } else System.out.println("ERROR");
        }
    }

    public static boolean isVowel(char ch) {
        char[] vowels = new char[]{'a', 'e', 'u', 'o', 'i'};
        for (char chc : vowels) {
            if (chc == ch) return true;
        }
        return false;
    }
}
