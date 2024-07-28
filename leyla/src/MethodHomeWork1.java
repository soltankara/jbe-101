//public class MethodHomeWork1 {
//    public static void main(String[] args) {
//        System.out.println(sum(1));
//        System.out.println(sum(1,2));
//        System.out.println(sum(1,2,3));
//        System.out.println(sum(1,2,3,4,5,6));
//        System.out.println(sum(1,2,3,4,5,6,7,8));
//
//    }
//    static int sum(int... numbers) {
//        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        return sum;
//    }
//}
//Writing with recursive method
public class MethodHomeWork1 {
    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4, 5, 6));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8));
    }
    static int sum(int... numbers) {
        return sumRecursive(numbers, 0);
    }
    static int sumRecursive(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sumRecursive(numbers, index + 1);
    }
}