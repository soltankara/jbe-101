package Session7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int[] nums ={3,7,5,6,8,9,4,2,1,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to delete: ");
        int num = sc.nextInt();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == num){
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
