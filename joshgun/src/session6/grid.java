package session6;
// 3 - Write a Java program to print the following grid.
public class grid {
    public static void main(String[] args){
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
