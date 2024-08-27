package Module02.Session20;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

public class Classwork {
    public static void main(String[] args) {
    }

    private static List<Integer> task1(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).toList();
    }

    private static List<String> task2(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    private static int task3(List<String> list) {
        return (int) list.stream().filter(n -> n.length() > 3).count();
    }

    private static Optional<Integer> task4(List<Integer> list) {
        return list.stream().filter(n -> n > 5).findFirst();
    }

    private static String task5(List<String> list) {
        return list.stream().collect(joining());
    }

    private static Map<Integer, List<String>> task6(List<String> list) {
        return list.stream().collect(groupingBy(String::length));
    }

    private static List<String> task7(List<String> list) {
        return list.stream().sorted(Comparator.comparingInt(String::length)).toList();
    }

    private static double task8(List<Integer> list) {
        return (double) list.stream().reduce(0, Integer::sum) / list.size();
    }
}
