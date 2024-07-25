package az.perfect.session8;

public class LessonHomeWork2 {

    public static void main(String[] args) {


        int b = sum(5, 9, 6, 7);
        System.out.println(b);

    }

    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    static int sum(int n1, int n2, int n3, int n4) {
        return n1 + sum(n2, n3, n4);
    }

    public static int sum(int... numbers) {

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}

