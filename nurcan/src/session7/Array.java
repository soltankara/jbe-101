package session7;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //1
        int[] arr1 = {7, 3, 13, 2, 0};
        String[] arr2 = {"Java", "c", "c++", "Python"};
        System.out.println("original numeric array: " + Arrays.toString(arr1));
        System.out.println("original string array: " + Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Sorted numeric array: " + Arrays.toString(arr1));
        System.out.println("Sorted string array : " + Arrays.toString(arr2));
        //2
        int[] numbers = {7, 3, 13, 2, 0};
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            res += numbers[i];
        }
        System.out.println(res);
        //3
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("-" + " ");
            }
            System.out.println();
        }
        //4
        int[] numbers = {7, 3, 13, 2, 1};
        double res = 0;
        double n = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            res += numbers[i];
        }
        double avrg = res / n;
        System.out.println("avarage value: " + avrg);
        //5
        Scanner scan = new Scanner(System.in);
        int[] arr = {13, 21, 147, 8, -5};
        boolean flag = false;
        System.out.print("Enter the number you are looking for: ");
        int search = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("This number is in the array");
        } else {
            System.out.println("this number is not in the array");
        }
        //6
        Scanner scan = new Scanner(System.in);
        int[] arr = {13, 21, 147, 8, -5};
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        boolean flag = false;
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                flag = true;
                break;
            }
            index++;
        }
        if (flag) {
            System.out.print("index of the element: " + index);
        } else {
            System.out.println("this number is not in the array");
        }
        //7
        Scanner scan = new Scanner(System.in);
        int[] arr = {13, 21, 147, 8, -5};
        System.out.print("Enter index: ");
        int index = scan.nextInt();
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("After removing element: ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        //8
        int[] arr = {4, 8, 12, 16, 20, 24};
        int[] arrCopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        System.out.print("Copy array: " + Arrays.toString(arrCopy));
        //9
        int[] arr = {4, 8, 12, 16, 20, 24};
        System.out.print("Enter the element: ");
        Scanner scan = new Scanner(System.in);
        int element = scan.nextInt();
        System.out.print("Enter the index: ");
        int index = scan.nextInt();
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (i == index) {
                arr2[i] = element;
            } else {
                arr2[i] = arr[j++];
            }
        }
        System.out.print("New array: " + Arrays.toString(arr2));
        //10
        int[] arr = {-3, 9, 27, 0, -8};
        int min = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max element: " + min);
        System.out.println("Min element: " + min);
        //11
        int[] arr = {3, 5, 7, 9, 3, 15};
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // və ya
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        //12
        int[] arr = {3, 5, 7, 9, 23, 37, 7};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println("dublicate element: " + arr[j]);
                }
            }
        }
        //13
        String[] fruits = {"apple", "orange", "chery", "banana", "apple"};
        for (int i = 0; i < fruits.length - 1; i++) {
            for (int j = 1; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j]) && i != j) {
                    System.out.println("Dublicate element: " + fruits[j]);
                }
            }
        }
        //14
        String[] arr1 = {"a", "b", "c", "d"};
        String[] arr2 = {"e", "f", "k", "d"};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println("Common element: " + arr1[i]);
                }
            }
        }
        //15
        int[] arr1 = {3, 5, 7, 9, 10, 24, 56, 0};
        int[] arr2 = {7, 2, 8, 3, 19, -1, 35, 2};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common element: " + arr1[i]);
                }
            }
        }
        //17
        int[] numbers = {3, 5, 7, 9, 11, 2};
        int min = numbers[0];
        for (
                int i = 1;
                i < numbers.length; i++) {
            if (numbers[i] >= min) {
                min = numbers[i];
            }
        }

        int secondMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= numbers[0]) {
                if (numbers[i] == min) {
                    continue;
                }
                secondMax = numbers[i];
            }
        }
        System.out.println(secondMax);
        //18
        int[] numbers = {3, 5, 7, 9, 11, 2};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
            }
        }
        int secondMin = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[0]) {
                if (numbers[i] == min) {
                    continue;
                }
                secondMin = numbers[i];
            }
        }
        System.out.println(secondMin);
        //19
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] sum = new int[arr1.length];
        for(int i = 0; i<arr1.length;i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        for(int item:sum) {
            System.out.print(item + " ");
        }

        //22
        Scanner scan = new Scanner(System.in);
        int[] arr = {-3, 7, 2, 8, 10, 4, 5};
        System.out.println("Enter the sum: ");
        int sum = scan.nextInt();
        for(int i = 0; i<arr.length -1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
                }
            }
        }
        //23
        int[] arr1 = {3, 5, 7, 9};
        int[] arr2 = {3, 5, 4, 9};
        boolean equality = true;
        for(int i = 0;i<arr1.length;i++) {
            if (arr1[i] != arr2[i]) {
                equality = false;
                break;
            }
        }
        if(equality)

        {
            System.out.println("This arrays are equal");
        } else

        {
            System.out.println("Not equal");
        }

        //24
        int[] arr = {1, 2, 3, 4, 5, 7, 8};
        int max = arr[0];
        for(int i = 1; i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int j = 1;j <=max;j++) {
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == j) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(j);
                break;
            }
        }
//25
        int array1[] = {2, 4, 8};
        int array2[] = {2, 3, 4, 8, 10, 16};
        int array3[] = {4, 8, 14, 40};
        int i = 0, j = 0, k = 0;
        while(i<array1.length &&j<array2.length &&k<array3.length)

        {
            if (array1[i] == array2[j] && array2[j] == array3[k]) {
                System.out.println("Common element " + array1[i]);
                i++;
                j++;
                k++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else if (array2[j] < array3[k]) {
                j++;
            } else {
                k++;
            }
        }

        //26
        int[] arr = {0, 0, 1, 2, 3, 0, 5, 8, 6};
        int n = arr.length;
        int count = 0;
        int[] newArr = new int[n];
        for(int i = 0; i<arr.length;i++) {
            if (arr[i] != 0) {
                newArr[count] = arr[i];
                count++;
            }
        }
        for(int i = count; i<n;i++) { //0 olmayan element sayina esasen indeks teyin edilir
            newArr[i] = 0;
        }
        for(int i :newArr) {
            System.out.print(i + " ");
        }
//27
        int arr[] = {2, 3, 4, 7, 8, 10, 15};
        int even = 0, odd = 0;
        for(
                int i = 0;
                i<arr.length;i++)

        {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);
        //28
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter 7 numbers: ");
        for(int i = 0; i< 7;i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0], min = arr[0];
        for(int i = 1; i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The difference between max and min elements: "+(max -min));
        //29
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int min = arr[0], max = arr[0];
        int count = 0;
        for(int i = 1; i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i = 0; i<arr.length;i++) {
            if (arr[i] == max || arr[i] == min) {
                continue;
            }
            count += arr[i];
        }
        System.out.println("average value of an array of integers except the largest and smallest values: "+(double)count/(arr.length-2));
        //30
        int[] arr = {-3, 7, 2, 8, 10, 4, 5};
        boolean flag = true;
        for(int i = 0; i<arr.length;i++) {
            if (arr[i] == 0 || arr[i] == -1) {
                System.out.println("there are 0 or -1");
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("there are not 0 or -1");
        }

        //31
        int[] arr = {10, 15, 20, 10, 37};
        int count = 0;
        for(int i = 0; i<arr.length;i++) {
            if (arr[i] == 10) {
                count += arr[i];
            }
        }
        if(count==30) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        //32
        int[] arr = {77, 32, 65, 18, 5, 7};
        boolean flag1 = false;
        boolean flag2 = false;
        for(int i = 0; i<arr.length;i++) {
            if (arr[i] == 65) {
                flag1 = true;
            }
            if (arr[i] == 77) {
                flag2 = true;
            }
        }
        if(flag1 &&flag2) {
            System.out.println("there are 77 and 65");
        }

        //35
        int[] arr = {1, 2, 4, 5, 6};
        int target = 6;
        boolean flag = false;
        for(int i = 0; i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    flag = true;
                }
            }
        }
        if(!flag) {
            System.out.println("Not found");
        }

    }
}

