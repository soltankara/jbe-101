package session7;

public class Arrays3 {
    public static void main(String[] args) {
        String [][] arr = new String[100][100];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = "- ";
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
