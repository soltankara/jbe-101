package az.perfect.session5.loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {



        //while loop
        // Daxil edilən ədədə qədər ədədlərin kvadratının tapılması

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int hasil = 1;
        int count = 1;

        while (num > count) {
            hasil = count * count;
            count++;
            System.out.println(hasil + " ");
        }

    }
}
