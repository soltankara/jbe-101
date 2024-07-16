package session7;

public class Arrays13 {
    public static void main(String[] args) {
        String [] arr = {"q", "s", "a", "b", "c", "d", "e", "a", "f", "g", "h"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate: " + arr[i]);
                }
            }
        }
    }
}
