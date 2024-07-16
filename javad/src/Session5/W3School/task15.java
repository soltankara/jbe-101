package Session5.W3School;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println("-------------------------");
        int it = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(it);
            it += 2;
        }
    }
}
