package Classworks;

import session15.CustomList;
import session15.CustomListImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class    Generics {
    public static void main(String[] args) {
        Integer[] nums1 = {1,2,3,4,5};

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");

        Function<Integer, Integer> anar = x -> x * x;
        int result = anar.apply(3);
        System.out.println("result = " + result);

        Pair<Integer, String> pair = new Pair<>(1, "c");

        CustomList<Integer> list1 = new CustomListImpl<>();

    }
    static <T> void printAll(T[] nums) {
        for (T num : nums) {
            System.out.println(num);
        }
    }

    static void print(List <? extends Number> nums) {
        for (Number num : nums) {
            System.out.println(num);
        }
    }

    static void printSuper(List <? super Integer> nums) {
        for (Object num : nums) {
            System.out.println(num);
        }
    }
    static <T extends Comparable<T>> T findMax(List <T> numbers) {
        T max = numbers.getFirst();
        for (T num : numbers) {
            if (max.compareTo(num) < 0) {
                max = num;
            }
        }
        return max;
    }

}
