import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        int first_number=scan.nextInt();
        System.out.println("Enter second number");
        int second_number=scan.nextInt();
        //1
        System.out.println(first_number+second_number);
        System.out.println(  first_number-second_number);
        System.out.println(first_number*second_number);
        System.out.println( first_number/second_number);
        //2
        System.out.println(first_number>second_number);
        System.out.println(first_number<second_number);
        System.out.println(first_number==second_number);
        System.out.println(first_number>=second_number);
        System.out.println(first_number<=second_number);
        System.out.println(first_number!=second_number);




    }
}
