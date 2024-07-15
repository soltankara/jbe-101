package ArrayExercises;

public class Ex4 {
    public static void main(String[] args) {
     //   4. Write a Java program to calculate the average value of array elements.
        int[] arr = {2,3,4,1,5};
        int sum = 0;

        for (int i : arr){
            sum += i;
        }
        System.out.println("Average value of the array elements is : " +sum/ arr.length);


    }
}
