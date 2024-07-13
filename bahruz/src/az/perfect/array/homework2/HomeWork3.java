package az.perfect.array.homework2;

public class HomeWork3 {

    public static void main(String[] args) {
        int arr[] = {25, 63, 48, 76, 95};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / arr.length;

        System.out.println("Average value of the array elements is" + average);
    }
}
