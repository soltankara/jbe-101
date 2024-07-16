//15. Write a Java program to find common elements between two integer arrays.
package session6ArrayW3resource;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayexercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of first array : ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("element " + (i + 1) + " : ");
            array1[i] = sc.nextInt();
        }
        System.out.println("first array :" + Arrays.toString(array1));
        System.out.print("enter the size of second array : ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("element " + (i + 1) + " : ");
            array2[i] = sc.nextInt();
        }
        System.out.println("second array :" + Arrays.toString(array2));
        Set<Integer> commonelement = findcommonelement(array1, array2);
        System.out.println("common element :" + commonelement);
    }
    public static Set<Integer> findcommonelement(int[] array1, int[] array2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonelements = new HashSet<>();
        for (int element : array1) {
            set1.add(element);
        }
        for (int element : array2) {
            if (set1.contains(element)) {
                commonelements.add(element);
            }
        }
        return commonelements;
    }
}
