package session6;
/* 52 - Write a Java program to separate even and odd numbers
 from a given array of integers. Put all even numbers first, and then odd numbers.*/

public class OddEven {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] result = separate(array);

        for (int num : result) System.out.print(num + " ");
    }

    public static int[] separate(int[] array) {
        int[] result = new int[array.length];
        int even = 0;
        int odd = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[even] = array[i];
                even++;
            } else {
                result[odd] = array[i];
                odd--;
            }
        }
        return result;
    }
}
