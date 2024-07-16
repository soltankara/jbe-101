package tasksSession6Practical;

public class Method {
    public static void main(String[] args) {
        System.out.println(isEvent(5));
        System.out.println(min(4, -2, -9));
        System.out.println(reverse("called"));
        System.out.println(average(new int[]{0, 5, 10}));
        System.out.println(findIndex(new int[]{0, 5, 10}, 5));
        System.out.println("sum: " + add(1, 2, 3, 4, 5, 6, 7, 8));
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static boolean isEvent(int number) {
        return number % 2 == 0 ? true : false;
    }

    static int min(int num1, int num2, int num3) {
        return Math.min(num3, Math.min(num1, num2));
    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    static double average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    static int findIndex(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

}