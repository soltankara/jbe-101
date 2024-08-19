package Classworks;

import java.util.Arrays;
import java.util.List;

public class JoinerImpl {

    public static void main(String[] args) {
        Joiner<Integer> integerJoiner = Arrays::asList;
        Joiner<String> stringJoiner = Arrays::asList;

        List<Integer> cosqun = integerJoiner.join(2, 4, 5, 6, 3, 8);
        List<String> anar = stringJoiner.join("1", "2", "3", "4", "5", "6", "7", "8");

        System.out.println(anar);
        System.out.println(cosqun);
    }

}
