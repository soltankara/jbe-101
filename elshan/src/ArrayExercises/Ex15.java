package ArrayExercises;

public class Ex15 {
    public static void main(String[] args) {
        //15. Write a Java program to find common elements between two integer arrays.

        int[] arr1 = {2,3,4,1,4};
        int[] arr2 = {1,9,0,2,7};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.println("Common element: " + arr2[j]);
                }
            }

        }
    }
}
