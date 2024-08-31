package Session7.W3School;

import java.util.ArrayList;
import java.util.List;

public class task21 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        Object[] array = arrList.toArray();
        for (Object container : array) {
            System.out.print(container + " ");
        }


    }
}
