package session6;

// 30 - Write a Java program to check if an array of integers is without 0 and -1.
public class Test3 {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 1, 8, 25, 24, 26};

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || array[i] == -1) {
                flag = false;
            }
        }

        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
