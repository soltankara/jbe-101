package src;

public class Exercise4 {

    public static void main(String[] args) {
        //4. Write a Java program to calculate the average value of array elements.

        int[] numbers = new int[]{2, 1, 9, 3, 6};

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        double average = sum / numbers.length;
        System.out.println(average);
    }
}