package Session7.W3School;

public class task3 {
    public static void main(String[] args) {
        char[][] arr = new char[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = '-';
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
