package Module02.Session10;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("name1", "author1");
        Book b2 = new Book("name1", "author1");
        Book b3 = b2;
        System.out.println(b2.equals(b1));//true
        System.out.println(b3 == b2);//true
        System.out.println(b3.equals(b2));//true
        System.out.println(b3 == b1);// false
        System.out.println(b3.equals(b1));//true
    }
    static void animalEat(Animal animal){
        animal.eat();
    }
}
