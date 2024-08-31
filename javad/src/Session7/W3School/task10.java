package Session7.W3School;

public class task10 {
    public static void main(String[] args) {
        int[] arr = {1000, -99, 2, 4, -5, 7, -999};
        System.out.print("array -> ");
        for (int container : arr) {
            System.out.print(container + "|");
        }
        System.out.println("\n-------------------------------");
        int max = arr[0], min = arr[0];
        for (int container : arr) {
            if (max < container) {
                max = container;
            }
            if (min > container) {
                min = container;
            }
        }
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);

    }
}
