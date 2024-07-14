package ArrayExercises;

public class Ex14 {
    public static void main(String[] args) {
        // 14. Write a Java program to find common elements between two arrays (string values).

        String[] arr1 = {"java","c++","python","swift"};
        String[] arr2 = {"c#","Sql","MySql","java"};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length ; j++) {
                if (arr1[i].equals(arr2[j])){
                    System.out.println("Common elements: " +arr2[j]);
                }
            }
        }

    }
}
