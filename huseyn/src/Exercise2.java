public class Exercise2 {

    public static void main(String[] args) {
        //2. Write a Java program to sum values of an array.

        int arr[] = {1, 3, 6, 8, 9};
        int sum = 0;

        for (int i : arr)
            sum += i;

        System.out.println(sum);
    }
}
