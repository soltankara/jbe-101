package session8;

public class Methods {

    public Methods() {
    }

    public static void main(String[] args) {
        int number = 5;
        int sumUsingLoop = sumUsingLoop(number);
        System.out.println("Sum of numbers: " + sumUsingLoop(number));
        int sumUsingRecursion = sumUsingRecursion(number);
        System.out.println("Sum of numbers: " + sumUsingRecursion(number));
        int[] var10001 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Sum of numbers: " + add(var10001));
    }

    static int sumUsingLoop(int number) {
        int sum = 0;

        for (int i = 1; i <= number; ++i) {
            sum += i;
        }

        return sum;
    }

    static int sumUsingRecursion(int number) {
        return number == 0 ? 0 : number + sumUsingRecursion(number - 1);
    }

    static int add(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        } else {
            int[] newNumbers = new int[numbers.length - 1];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length - 1);
            return numbers[numbers.length - 1] + add(newNumbers);
        }
    }
}


