package ArrayExercises;

public class Ex3 {
    public static void main(String[] args) {
        //  3. Write a Java program to print the following grid.

        int[][] arr = new int[5][5];

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%2d", arr[j][i]);

            }
            System.out.println();
        }
    }
}
