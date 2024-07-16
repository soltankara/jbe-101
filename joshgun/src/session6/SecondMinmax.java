package session6;
// 17 - Write a Java program to find the second largest element in an array.
// 18 -Write a Java program to find the second smallest element in an array.
public class SecondMinmax {
    public static void main(String[] args) {
        int[] array = {4, 29, 1, 192, 38, 19, 37, 12, 2, 310};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int secondmin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != min) {
                if (array[i] < secondmin) {
                    secondmin = array[i];
                }
            }
        }
        System.out.println(secondmin);

        //for printing second maximum value
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int secondmax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != max) {
                if (array[i] > secondmax) {
                    secondmax = array[i];
                }
            }
        }
        System.out.println(secondmax);
    }
}
