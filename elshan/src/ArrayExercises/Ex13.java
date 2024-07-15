package ArrayExercises;

public class Ex13 {
    public static void main(String[] args) {
        //13. Write a Java program to find duplicate values in an array of string values.

        String[] arr = {"java","c++","java","python"};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)){
                    System.out.println("Duplicate element: " + arr[j]);
                }
            }

        }

    }
}
