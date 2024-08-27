package az.turing.session15;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Task1
        Pair<String> stringPair = new Pair<>("Hello", "World");
        Pair<Integer> integerPair = new Pair<>(1, 2);

        System.out.println(stringPair.getFirstElement() + " " + stringPair.getSecondElement());
        System.out.println(integerPair.getFirstElement() + " " + integerPair.getSecondElement());

        //Task2
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(15);
        integerList.add(56);
        integerList.add(41);
        integerList.add(34);
        int max = findMax(integerList);
        System.out.println(max);

        //Task3
        ProductRepository productRepository = new ProductRepository();
       // productRepository.productAdd();
        List<Product> productList = productRepository.productList;
        System.out.println(productList);


    }


    //Task2
    public static <M extends Comparable<M>> M findMax(List<M> list) {
        if (list == null && list.isEmpty()) {
            throw new NullPointerException("List is empty");
        }
        M maxElement = list.get(0);
        for (M m : list) {
            if (m.compareTo(maxElement) > 0) {
                maxElement = m;


            }

        }
        return maxElement;

    }
}
