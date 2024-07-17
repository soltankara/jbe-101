package Session7Methods;
public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }
    public static int sum(int... arr) {
        return sumWithRecursive(arr, arr.length - 1);
    }
    private static int sumWithRecursive(int[] numbers, int index) {
        if (index < 0) {
            return 0;
        }
        return numbers[index] + sumWithRecursive(numbers, index - 1);
    }
}
