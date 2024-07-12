package session6;

/* 31 - Write a Java program to check if the sum of all the 10's in the array is exactly 30.
Return false if the condition does not satisfy, otherwise true.*/
public class Ten {
    public static void main(String[] args) {
        int[] array = {20, 10, 28, 19, 10, 22, 37, 17, 10, 23};

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                k++;
            }
        }
        if (k == 3) System.out.println("true");
        else System.out.println("false");
    }
}
