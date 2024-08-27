package az.turing.session8;

public class LessonHomeWork {


    public static void main(String[] args) {

        //Factorial
        System.out.println(factorial(0));
        System.out.println(factorial(5));
    }


    public static int factorial(int number) {
        return number == 0 ? 1 : number * factorial((number - 1));
    }


    //Exercise1
    public static String isEven(int number) {
        return number % 2 == 0 ? "even" : "no even";
    }

    //Exercise2
    public static int isMinimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    //Exercise3
    //Reverse 1.
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    //Exercise3
    //Reverse 2.
    public static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    //Exercise4
    public static double isAverage(int a[]) {

        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return (double) sum / a.length;


    }

    //Exercise5
    public static int findIndex(int arr[], int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;


    }

}
