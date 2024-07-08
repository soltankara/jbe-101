package Exercises.src;

import java.util.Scanner;

//8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

public class ElshanEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        String simvol = scanner.nextLine();

        if ((simvol.length() > 1) ){
            System.out.println("Yalniz bir simvol daxil edin!");
        }
        else {
            char character = simvol.charAt(0);

            if (!Character.isLetter(character)){
                System.out.println("Elifba simvolu daxil edin!");
            }
            else {
                character = Character.toUpperCase(character);
                if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                    System.out.println("Daxil edilen simvol saitdir.");
                } else {
                    System.out.println("Daxil edilen simvol sammitdir.");
                }
            }

        }
    }
}
