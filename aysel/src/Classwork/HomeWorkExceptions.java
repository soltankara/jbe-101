package Classwork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HomeWorkExceptions {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(2, 0);
            System.out.println("Result:" + result);
        } catch (ArithmeticException n) {
            System.out.println("Exception:" + n.getMessage());
        }

        int n = 22;
        tryNumbers(n);
        n = 3;
        tryNumbers(n);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nece eded daxil olunacaq?:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Ededleri daxil edin");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        try {
            checkForDuplicates(numbers);
            System.out.println("Dublikat eded yoxdur");
        } catch (DuplicateNumberException d) {
            System.out.println(d.getMessage());

        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string daxil edin:");
        String input = scan.nextLine();

        try {
            VowelSymbolException.checkForVowels(input);
            System.out.println("String saitləri ehtiva edir.");
        } catch (VowelSymbolException e) {
            System.out.println(e.getMessage());
        }


    }

    // Tapsiriq No1
    public static int divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Sifira bolme movcud deyil.");
        }
        return num1 / num2;

    }

    //Tapsiriq No2
    public static void tryNumbers(int n) {
        try {
            checkEvenNumbers(n);
            System.out.println(n + " is even");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }

    public static void checkEvenNumbers(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Tek eded qebul ede bilmez");
        }
    }


    //Tapsiriq No3


    static class DuplicateNumberException extends Exception {
        public DuplicateNumberException(String message) {
            super(message);
        }
    }

    public static void checkForDuplicates(int[] numbers) throws DuplicateNumberException {
        Set<Integer> set = new HashSet<>();

        for (int number : numbers) {
            if (!set.add(number)) {
                throw new DuplicateNumberException("Dublikat ədəd tapıldı: " + number);
            }
        }
    }
}

// Tapsiriq No4
class VowelSymbolException extends Exception {
    public VowelSymbolException(String message) {
        super(message);
    }

    public static void checkForVowels(String input) throws VowelSymbolException {
        String vowels = "AEOUIaeoui";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return;
            }
        }
        throw new VowelSymbolException("Stringde sait yoxdur");

    }
}

