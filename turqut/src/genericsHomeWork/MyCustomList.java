package genericsHomeWork;

import java.util.Optional;

public class MyCustomList {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomListImpl<>();
        list.add(1);
        list.add(2);
        list.addAll(3, 4, 5);

        System.out.println("List elements:");
        list.print();

        list.remove(3);
        System.out.println("After removing 3:");
        list.print();

        try {
            System.out.println("Element at index 2: " + list.getByIndex(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Optional<Integer> element = list.findByIndex(1);
        element.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Element not found")
        );
    }
}
