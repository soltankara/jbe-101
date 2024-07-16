//11. Write a Java program to reverse an array of integer values.
package session6ArrayW3resource;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayexercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("element  " + (i + 1) + "  : ");
            array[i] = sc.nextInt();
        }
        System.out.println("original  array is  : " + Arrays.toString(array));
        int[] reversearay = reversearray(array);
        System.out.println("reversed array is  : " + Arrays.toString(reversearay));
    }
    public static int[] reversearray(int[] array) {
        int size = array.length;
        int[] newarray = new int[size];
        for (int i = 0; i < size; i++) {
            newarray[i] = array[size - 1 - i];
        }
        return newarray;
    }
}