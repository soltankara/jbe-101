package az.turing.session7.homework1;

public class homework2 {

    public static void main(String[] args) {

      //

        Box<Integer> box=new Box<>(5);
        Box<Double> box1=new Box<>(5.3);
        System.out.println(box.getdata()+box1.getdata());



    }

    public static int printarray(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (ArithmeticException ex) {
            System.out.println(" can not zero ");
            return -1;
        } finally {
            System.out.println("Insns ");
            return 15;
        }
    }
}