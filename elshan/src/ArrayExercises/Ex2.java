package ArrayExercises;

public class Ex2 {
    public static void main(String[] args) {
        //2. Write a Java program to sum values of an array.
         int[] arr = {2,3,4,1,5};
         int sum = 0;

         for (int i : arr){
             sum += i;
         }
        System.out.println("The sum is: " +sum);

    }
}
