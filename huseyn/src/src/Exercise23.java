package src;

public class Exercise23 {

    public static void main(String[] args) {
        //23. Write a Java program to test two arrays' equality.

        int[] arr1 = {2, 5, 7, 9, 11};
        int[] arr2 = {2, 5, 7, 9, 11};


        if (arr1.length != arr2.length) {
            System.out.println("Two arrays are not equal.");
        } else {
            boolean isEqual = true;


            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }


            if (isEqual) {
                System.out.println("Two arrays are equal.");
            } else {
                System.out.println("Two arrays are not equal.");
            }
        }
    }
}