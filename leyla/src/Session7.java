import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        //Array exercises #1;
        int[] numbers = {12,23,77,45,33,67,78};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        String[] names ={"John","Jane", "Doe","Jack"};
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //exercise 2
        int[] numbers = {4, 56, 23, 12, 11};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", table[i][j]);
            }
            System.out.println();
        }
        //exercise 4
        int[] arr = {34, 45, 12, 11, 7};
        int total = 0;
        int average = 0;
        for (int i = 0; i < 5; i++) {
            total += arr[i];
            average = total / arr.length;
        }
        System.out.println(average);
        //exercise 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the array");
        int value = sc.nextInt();
        boolean found = false;
        int[] arr = {22, 99, 66, 54, 98};
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println("Array contains specific value");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Array doesnt contain specific value");
            found = true;
        }
        //exercise 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the array:");
        int value = sc.nextInt();
        int[] arr = {1, 2, 45, 65, 78};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        //exercise 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the specific value of the array");
        int value = sc.nextInt();
        int[] arr = {22, 23, 56, 89, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println("Daxil edilmis eded cixarildiqdan sonra array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + " ");
        }
        //exercise 8
        int[] arr = {22, 33, 44, 55, 66, 77};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        //exercise 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the array");
        int value = sc.nextInt();
        int[] arr = {22, 33, 44, 55, 66, 77};
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = value;
        System.out.println("The new array is: " + Arrays.toString(newArr));
        //exercise 10
        int[] arr = {2, 9, 0, 8, 56};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        //exercise 11
        int[] arr = {47, 89, 76, 33, 22};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        //exercise 12
        int[] arr = {1, 2, 3, 3, 44, 66, 77, 88};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + arr[j]);
                }
            }
        }
        //exercise 13
        String[] arr = {"Leyla", "Sebuhi", "Arzu", "Nigar", "Arzu"};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + arr[j]);
                }
            }
        }
        //exercise 14
        String[] arr = {"Elxan", "Araz", "Aysel", "Gulnar", "Fariz"};
        String[] arra = {"Rena", "Ibrahim", "Seid", "Aysel", "Ayan", "Elxan"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arra.length; j++) {
                if (arr[i] == arra[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
        //exercise 15
        int[] arr = {22, 34, 54, 65, 76};
        int[] arra = {21, 22, 33, 34, 45, 54, 65, 66, 77};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arra.length; j++) {
                if (arr[i] == arra[j]) {
                    System.out.println(arr[i]);
                }
            }
        //exercise 16
        int[] arr = {22, 45, 46, 47, 48, 49, 50, 50};
        int no_unique_elements = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[no_unique_elements - 1];
                    no_unique_elements--;
                    j--;
                }
            }
        }
        int[] array1 = Arrays.copyOf(arr, no_unique_elements);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array with unique values : " + array1[i]+"\t");
        }
        System.out.println();
        //exercise 17
        int[] arr = {22, 76, 887, 44, 24, 36, 3};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                if (arr[i] == max) {
                    continue;
                }
                secondMax = arr[i];
                break;
            }
        }
        System.out.println(secondMax);
    }
}
        //exercise 18
        int[] arr = {23, 43, 53, 64, 98, 0, 5, 4};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        int secondMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                if (arr[i] == min) {
                    continue;
                }
                secondMin = arr[i];
                break;
            }
        }
        System.out.println(secondMin);
        //exercise 19
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows of the matrix");
        int m = in.nextInt();
        System.out.println("Input number of columns of the matrix");
        int n = in.nextInt();
        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];
        System.out.println("Input elements of the first matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = in.nextInt();
            }
        }
        System.out.println("Input elements of the second matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < m; i++) {
            for (int j= 0; j < n; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
        //exercise 23
        int[] arr = {11, 12, 13, 14, 15, 17};
        int[] arra = {22, 12, 555, 14, 442, 33};
        boolean isEqual = true;
        if (arr.length == arra.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arra[i]) {
                    isEqual = false;
                }
            }
        } else {
            isEqual = false;
        }
        if (isEqual) {
            System.out.println("Two arrays are equal.");
        } else {
            System.out.println("Two arrays are not equal.");
        }
    }
}

















