package module1.session7;

public class Arrays12 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 7, 9};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate: " + a[j]);
                }
            }
        }
    }
}
