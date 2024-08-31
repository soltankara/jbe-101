package Session7.W3School;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter specific value: ");
        int specificValue = sc.nextInt();
        boolean specificCase = false;
        int[] arr = {2, 4, 8, 16, 32, 64, 128, 256};
        for (int container : arr) {
            if(specificValue==container){
                specificCase = true;
            }
            System.out.print(container + " ");
        }
        System.out.println("\n---------------------------------------");
        if (specificCase) System.out.println(specificValue+" was found");
        else System.out.println(specificValue+" was not found");


    }
}
