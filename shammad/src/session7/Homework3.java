package session7;

public class Homework3 {
    public static void main(String[] args) {
        //6. Write a Java program to find the index of an array element.
        int[] arr3 = new int[]{1, 5, 3, 8, 2, 9};
        int numberToSearch = 2;

        boolean found = false;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == numberToSearch) {
                found = true;
                System.out.println("Index of searched element is: " + i);
                break;
            }
        }
        if (!found)
            System.out.println("Searched element is not in the array.");
    }
}
