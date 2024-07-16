//14. Write a Java program to find common elements between two arrays (string values).
package session6ArrayW3resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        String[] commonElements = findCommonElement(array1, array2);
        if (commonElements.length == 0) {
            System.out.println("common element was not funded");
        } else {
            System.out.println("common elements :" + Arrays.toString(commonElements));
        }
    }
    public static String[] findCommonElement(String[] arr1, String[] arr2) {
        List<String> commonList = new ArrayList<>();
        for (String i : arr1) {
            for (String j : arr2) {
                if (i.equals(j) && !commonList.contains(i)) {
                    commonList.add(i);
                    break;
                }
            }
        }
        return commonList.toArray(new String[0]);
    }
}