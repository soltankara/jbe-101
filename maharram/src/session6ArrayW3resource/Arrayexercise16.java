//16. Write a Java program to remove duplicate elements from an array.
package session6ArrayW3resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        int[] newarray = removedublicate(array);
        System.out.println("the array which without dublicate  :" + Arrays.toString(newarray));
    }
    public static int[] removedublicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] arraywithoutdublicate = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            arraywithoutdublicate[index++] = i;
        }
        return arraywithoutdublicate;
    }
}
