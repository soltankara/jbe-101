package Exercises;

public class ElshanEx18 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0 ; i <= 5 ; i++){
            for (int j = 0 ; j <= i; j++ ){
                System.out.print(num + " ");
                num++;

            }
            System.out.println(" ");
        }
    }
}
