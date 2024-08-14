package session15;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("white");
        list.add("black");
        list.add("red");
        list.print();
        Optional<String> color = list.findByIndex(2);
        color.ifPresent(System.out::println);
        list.remove("red");
        list.print();
        try {
            String element = list.getByIndex(1);
            System.out.println(element);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
