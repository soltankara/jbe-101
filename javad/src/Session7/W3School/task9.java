package Session7.W3School;


import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 3, 1, -7, 99};
        System.out.println("---------------------------");
        System.out.print("original array -> ");
        for (int container : arr) {
            System.out.print(container + " ");
        }
        System.out.print("\nEnter position (index) : ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.print("Enter value : ");
        int val = sc.nextInt();

        int[] newArr = new int[arr.length + 1];
        int it = 0;
        int newArrIndex = 0;
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = val;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println("\n---------------------------");
        for (int container : newArr) {
            System.out.print(container + " ");
        }
    }

}
