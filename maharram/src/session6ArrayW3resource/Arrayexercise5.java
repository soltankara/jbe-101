//5.Write a Java program to test if an array contains a specific value.
package session6ArrayW3resource;
public class Arrayexercise5 {
    public static boolean keep(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] array6 = {1, 2, 3, 4, 5};
        System.out.println(keep(array6, 6));
    }
}
