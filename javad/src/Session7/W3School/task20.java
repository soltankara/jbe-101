package Session7.W3School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task20 {
    public static void main(String[] args) {
        String[] arr = {"Quba", "Xacmaz", "Lenkeran", "Qax", "Tovuz", "Babek", "Zengilan", "Baki"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        for (String container : arrList) {
            System.out.print(container + " ");
        }
        System.out.println("\n-------------------------------------");
        System.out.println(arrList.getFirst());
        System.out.println("\n-------------------------------------");
        System.out.println(arrList.getLast());
        System.out.println("\n-------------------------------------");
        System.out.println(arrList.get(3));
        System.out.println("\n-------------------------------------");
        arrList.add("Kurdemir");
        arrList.remove("Tovuz");
        for (String container : arrList) {
            System.out.print(container + " ");
        }
        System.out.println("\n-------------------------------------");
    }


}
