package Classworks;

public enum Day implements Printable{
    MONDAY{
        @Override
        public void print() {
            System.out.println("this is MONDAY");
        }
    }
}
