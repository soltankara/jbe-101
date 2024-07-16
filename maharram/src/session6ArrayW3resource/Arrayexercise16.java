//16. Write a Java program to remove duplicate elements from an array.
package session6ArrayW3resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Arrayexercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size array  :");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println("array  : " + Arrays.toString(array));
        int[] lastArray = removeDublicatElement(array);
        System.out.println("last array :" + Arrays.toString(lastArray));
    }
    public static int[] removeDublicatElement(int arr[]) {
        List<Integer> listWithoutDublicate = new ArrayList<>();

        for (int i : arr) {
            if (!listWithoutDublicate.contains(i)) {
                listWithoutDublicate.add(i);
            }
        }
        int[] arrayWithoutDublicate = new int[listWithoutDublicate.size()];
        for (int i = 0; i < listWithoutDublicate.size(); i++) {
            arrayWithoutDublicate[i] = listWithoutDublicate.get(i);
        }
        return arrayWithoutDublicate;
    }
}