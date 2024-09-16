package aysel.src.Sesssion24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomBoundedInt = random.nextInt(100);
        int[] array = new int[1];

        System.out.println("Let the game begin!");
        while (true) {
            System.out.println("Enter a number:");
            int name = scanner.nextInt();
            array = addNumberToArray(array, name);

            if (name < randomBoundedInt) {
                System.out.println("Your number is too small. Please, try again..");

            } else if (name > randomBoundedInt) {
                System.out.println("Your number is too big. Please, try again..");

            } else {
                System.out.println("Congratulations ," + name);
                if (array.length > 0) {
                    Arrays.sort(array);
                }
                System.out.println("Your numbers:");
                for (int number : array) {
                    System.out.println(number);
                }

            }

        }


    }

    public static int[] addNumberToArray(int[] array, int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = number;
        return newArray;
    }

}


