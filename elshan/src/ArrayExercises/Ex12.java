package ArrayExercises;

public class Ex12 {
    public static void main(String[] args) {
        // 12. Write a Java program to find duplicate values in an array of integer values.
        int[] arr = {1, 1, 2, 3, 4, 4, 5};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1;j < arr.length; j++){
                if ((arr[i] == arr[j]) && (i != j)){
                    System.out.println("Dupilacte element: " +arr[j]);
                }
            }
        }

    }
}
