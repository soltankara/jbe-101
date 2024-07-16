package Session5.W3School;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        String character = sc.nextLine().toLowerCase();
        boolean characterCondition = (character.charAt(0) >= 65 && character.charAt(0) <= 90) || (character.charAt(0) >= 97 && character.charAt(0) <= 122);
        if (character.length() > 1 || !characterCondition) {
            System.out.println("Error!");
        } else {
            switch (character) {
                case "a", "e", "o", "u", "i" -> System.out.println("it's Vowel");
                default -> System.out.println("it's Consonant");
            }
        }
    }
}
