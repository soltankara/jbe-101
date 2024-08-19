package Session15_Generics;

public class Main {
    public static void main(String[] args) {
        try {
            CustomList<String> customList = new MyCustomArrayList<>();
            customList.add("BMW");
            customList.addAll("MERCEDES", "AUDI", "KIA");
            customList.print();
            customList.remove("KIA");
            customList.print();
            customList.add("Porche");
            customList.print();
            System.out.println("element at 1 index :" + customList.getByIndex(1));
            System.out.println("element at 6 index :" + customList.getByIndex(0));
            System.out.println("element at 2 index :" + customList.findByIndex(2));
            System.out.println("element at 5 index :" + customList.findByIndex(5));
            System.out.println("element at 6 index :" + customList.getByIndex(4));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
