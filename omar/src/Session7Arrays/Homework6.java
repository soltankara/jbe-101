package Session7Arrays;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
    int[] nums ={4,6,5,5,4,6,4,6,2,8};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the element : " );
    int element = sc.nextInt();
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == element) {
            index = i;
        }

    }
    System.out.println("The index is " + index);
    }
}
