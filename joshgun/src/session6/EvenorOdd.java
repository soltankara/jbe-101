package session6;

// 27 - Write a Java program to find the number of even and odd integers in a given array of integers.
public class EvenorOdd {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 25, 243, 121, 5, 8, 7}; //6 odd & 3 even
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                k++;
            }
        }
        System.out.println("The number of even numbers: " + k);
        System.out.println("The number of odd numbers: " + (array.length - k));
    }
}
