package Algorithms;

public class SearchingAlgorithms {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5};
        int target = 5;

        //    Linear Search O(n)
//        System.out.println(linearSearch(numbers, target));
        //    Bineary Search O(log n)
        System.out.println(binearySearch(numbers, target));
    }

    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binearySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int midIndex = (low + high) / 2;
            int midNumber = numbers[midIndex];

            if (midNumber == target) {
                return midIndex;
            }
            if (midNumber > target) {
                high = midIndex - 1;
            } else {
                low = midIndex + 1;
            }
        }
        return -1;
    }
}
