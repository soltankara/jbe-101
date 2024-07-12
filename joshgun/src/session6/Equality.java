package session6;

// 23 - Write a Java program to test two arrays' equality.
public class Equality {
    public static void main(String[] args) {
        int[] array1 = {3, 5, 2, 1};
        int[] array2 = {5, 1, 4, 1};

        boolean flag = true;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
