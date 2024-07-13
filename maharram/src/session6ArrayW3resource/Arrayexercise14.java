//14. Write a Java program to find common elements between two arrays (string values).
package session6ArrayW3resource;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayexercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of first array : ");
        int size1 = sc.nextInt();
        String[] array1 = new String[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("element " + (i + 1) + " : ");
            array1[i] = sc.next();
        }
        System.out.println("first array :" + Arrays.toString(array1));
        System.out.print("enter the size of second array : ");
        int size2 = sc.nextInt();
        String[] array2 = new String[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("element " + (i + 1) + " : ");
            array2[i] = sc.next();
        }
        System.out.println("second array :" + Arrays.toString(array2));
        Set<String> commonelement = findcommonelement(array1, array2);
        System.out.println("common element :" + commonelement);
    }
    public static Set<String> findcommonelement(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> commonelements = new HashSet<>();
        for (String element : array1) {
            set1.add(element);
        }
        for (String element : array2) {
            if (set1.contains(element)) {
                commonelements.add(element);
            }
        }
        return commonelements;
    }
}
