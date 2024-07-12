package session6;

/* 32 - Write a Java program to check if an array of integers
contains two specified elements 65 and 77.*/
public class Check {
    public static void main(String[] args) {
        int[] array = {65, 77, 77, 65, 65, 77};

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 65 && array[i] != 77) {
                flag = false;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
