package Exercises.src;

public class ElshanEx17 {
    public static void main(String[] args) {
//17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
        int tmp = 0;
        int i;
        int j;
        for (i = 1, j =1 ; i <= 4;i++,j = (j*10)+1){
            System.out.println(i*j);
        }
    }
}


