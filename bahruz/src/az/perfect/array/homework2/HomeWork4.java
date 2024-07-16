package az.perfect.array.homework2;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        int arr[] = {25, 63, 47, 58, 16, 74};
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the number (Enter 0 to Exit): ");
            int number = sc.nextInt();

            if(number==0){
                System.out.println("Exiting....");
                System.exit(0);
            }

            if (containsArr(arr, number) == true) {
                System.out.println("This element belongs to array");
            } else {
                System.out.println("This element doesn't belong to array");
            }

            sc.close();


        }
    }

    public static boolean containsArr(int arr[], int number) {

        for (int i : arr) {
            if (i == number) {
                return true;
            }

        }
        return false;
    }
}
