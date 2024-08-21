package Module02.Session15;

import java.util.ArrayList;
import java.util.List;

public class Classwork {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(findMax(list));
        printNumbers(list);
    }

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        T max = list.getFirst();
        for (T t : list) {
            if (max.compareTo(t) < 0) max = t;
        }
        return max;
    }

    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.print(number + " ");
        }
    }
}
