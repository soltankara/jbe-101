package Exercises.src;

public class ElshanEx20 {
    public static void main(String[] args) {
        //20. Write a Java program to print Floyd's Triangle.
        int num=1;
        for (int i = 1; i <= 5 ;i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
