package Exercises;

import java.util.Scanner;

//8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

public class ElshanEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char simvol = scanner.nextLine().charAt(0);

        if (!Character.isLetter(simvol)) {
            System.out.println("Elifba simvolu daxil edin!");
        } else {
            simvol = Character.toUpperCase(simvol);
            if (simvol == 'A' || simvol == 'E' || simvol == 'I' || simvol == 'O' || simvol == 'U') {
                System.out.println("Daxil edilen simvol saitdir.");
            } else {
                System.out.println("Daxil edilen simvol sammitdir.");
            }
        }

    }
}

