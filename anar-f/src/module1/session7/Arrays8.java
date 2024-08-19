package module1.session7;

public class Arrays8 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] ints = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ints[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
