package turqut.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.*;
public class ArraysSession7 {
    public static void main(String[] args) {
        //Task 1 - Write a Java program to sort a numeric array and a string array.
        int numericArray[] = {3, 5, 1, 6, 2, 8, 12, 4};
        String stringArray[] = {"date", "banana", "elderberry", "apple", "cherry"};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));
        System.out.println("Original string array: " + Arrays.toString(stringArray));
        Arrays.sort(numericArray);
        Arrays.sort(stringArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

        //Task 2 - Write a Java program to sum values of an array.
        int[] arr1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr1) {
            sum += num;
        }
        System.out.println("Sum of the array elements: " + sum);

        //Task 3 - Write a Java program to print the following grid.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("-" + " ");
            }
            System.out.println();
        }

        //Task 4 - Write a Java program to calculate the average value of array elements.
        int[] arr2 = {1, 2, 3, 4, 5};
        int sum2 = 0;
        for (int num : arr2) {
            sum2 += num;
        }
        double average = (double) sum2 / arr2.length;
        System.out.println("Average of the array elements: " + average);

        //Task 5 - Write a Java program to test if an array contains a specific value.
        int[] arr3 = {1, 2, 3, 4, 5};
        int value = 3;
        boolean flag = true;
        for (int num : arr3) {
            if (num == value) {
                System.out.println(value + " is present in the array.");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(value + " is not present in the array.");
        }

        //Task 6 - Write a Java program to find the index of an array element.
        int[] arr4 = {1, 2, 3, 4, 5};
        int value2 = 3;
        int index = -1;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == value2) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The index of " + value2 + " is " + index + ".");
        } else {
            System.out.println(value2 + " is not present in the array.");
        }

        //Task 7 - Write a Java program to remove a specific element from an array.
        int[] arr5 = {1, 2, 3, 4, 5};
        int value3 = 3;
        int[] newArr = new int[arr5.length - 1];
        int k = 0;
        for (int num : arr5) {
            if (num != value3) {
                newArr[k++] = num;
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr5));
        System.out.println("New array after removing " + value3 + ": " + Arrays.toString(newArr));

        //Task 8 - Write a Java program to copy an array by iterating the array.
        int[] arr6 = {1, 2, 3, 4, 5};
        int[] newArr2 = new int[arr6.length];
        for (int i = 0; i < arr6.length; i++) {
            newArr2[i] = arr6[i];
        }
        System.out.println("Original array: " + Arrays.toString(arr6));
        System.out.println("Copied array: " + Arrays.toString(newArr2));

        //Task 9 - Write a Java program to insert an element (specific position) into an array.
        int[] arr7 = {1, 2, 3, 4, 5};
        int value4 = 6;
        int position = 2;
        int[] newArr3 = new int[arr7.length + 1];
        System.arraycopy(arr7, 0, newArr3, 0, position);
        newArr3[position] = value4;
        System.arraycopy(arr7, position, newArr3, position + 1, arr7.length - position);
        System.out.println("Original array: " + Arrays.toString(arr7));
        System.out.println("New array after inserting " + value4 + " at position " + position + ": " + Arrays.toString(newArr3));

        //Task 10 - Write a Java program to find the maximum and minimum value of an array.
        int[] arr8 = {1, 2, 3, 4, 5};
        int max = arr8[0];
        int min = arr8[0];
        for (int num : arr8) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        //Task 11 - Write a Java program to reverse an array of integer values.
        int[] arr9 = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr9.length];
        for (int i = arr9.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr9[i];
        }
        System.out.println("Original array: " + Arrays.toString(arr9));
        System.out.println("Reversed array: " + Arrays.toString(reversedArr));

        //Task 12 - Write a Java program to find duplicate values in an array of integer values.
        int[] arr10 = {1, 2, 3, 4, 5, 2, 3, 4};
        for (int i = 0; i < arr10.length - 1; i++) {
            for (int j = i + 1; j < arr10.length; j++) {
                if (arr10[i] == arr10[j] && i != j) {
                    System.out.println("Duplicate value: " + arr10[i]);
                    break;
                }
            }
        }

        //Task 13 - Write a Java program to find duplicate values in an array of string values.
        String[] arr11 = {"apple", "banana", "cherry", "apple", "banana"};
        for (int i = 0; i < arr11.length - 1; i++) {
            for (int j = i + 1; j < arr11.length; j++) {
                if (arr11[i] == arr11[j] && i != j) {
                    System.out.println("Duplicate value: " + arr11[i]);
                    break;
                }
            }
        }

        //Task 14 - Write a Java program to find common elements between two arrays (string values).
        String[] arr12 = {"apple", "banana", "cherry"};
        String[] arr13 = {"banana", "cherry", "date"};
        for (int i = 0; i < arr12.length; i++) {
            for (int j = 0; j < arr13.length; j++) {
                if (arr12[i] == arr13[j]) {
                    System.out.println("Common value: " + arr12[i]);
                    break;
                }
            }
        }

        //Task 15 - Write a Java program to find common elements between two integer arrays.
        int[] arr14 = {1, 2, 3, 4, 5};
        int[] arr15 = {4, 5, 6, 7, 8};
        for (int num1 : arr14) {
            for (int num2 : arr15) {
                if (num1 == num2) {
                    System.out.println("Common value: " + num1);
                    break;
                }
            }
        }

        //Task 16 - Write a Java program to remove duplicate elements from an array.
        int[] arr16 = {1, 2, 3, 4, 5, 2, 3, 4};
        System.out.println("Original array: " + Arrays.toString(arr16));
        int size = arr16.length;
        int[] temp = new int[size];
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr16[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize++] = arr16[i];
            }
        }
        int[] newArr4 = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            newArr4[i] = temp[i];
        }
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArr4));

        //Task 17 - Write a Java program to find the second-largest element in an array.
        int[] arr17 = {1, 2, 3, 4, 5};
        int max1 = arr17[0];
        int max2 = arr17[0];
        for (int num : arr17) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        System.out.println("Second largest element in the array: " + max2);

        //Task 18 - Write a Java program to find the second-smallest element in an array.
        int[] arr18 = {1, 2, 3, 4, 5};
        Arrays.sort(arr18);
        int min2 = arr18[1];
        System.out.println("Second smallest element in the array: " + min2);

        //Task 19 - Write a Java program to add two matrices of the same size.
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Result matrix : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        //Task 20 - Write a Java program to convert an array to an ArrayList.
        String[] arr20 = new String[]{"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList list = new ArrayList(Arrays.asList(arr20));
        System.out.println(list);

        //Task 21 - Write a Java program to convert an ArrayList to an array.
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Python", "JAVA", "PHP", "Perl", "C#", "C++"));
        String[] arr21 = new String[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            arr21[i] = list2.get(i);
        }
        System.out.println(Arrays.toString(arr21));

        //Task 22 - Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
        int[] arr22 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetSum = 10;
        System.out.println("Pairs with sum " + targetSum + ":");
        for (int i = 0; i < arr22.length - 1; i++) {
            for (int j = i + 1; j < arr22.length; j++) {
                if (arr22[i] + arr22[j] == targetSum) {
                    System.out.println("(" + arr22[i] + ", " + arr22[j] + ")");
                }
            }
        }

        //Task 23 - Write a Java program to test two arrays' equality.
        int[] arr23_1 = {1, 2, 3, 4, 5};
        int[] arr23_2 = {1, 2, 3, 4, 6};
        boolean areEqual = Arrays.equals(arr23_1, arr23_2);
        System.out.println("Arrays are equal: " + areEqual);

        //Task 24 - Write a Java program to find a missing number in an array.
        int[] arr24 = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int expectedSum = 55;
        int sum1 = 0;
        for (int num : arr24) {
            sum1 += num;
        }
        int missingNumber = expectedSum - sum1;
        System.out.println("Missing number: " + missingNumber);

        //Task 27 - Write a Java program to find the number of even and odd integers in a given array of integers.
        int[] arr27 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr27) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);

        //Task 28 - Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.
        int[] arr28 = {1, 2, 3, 4, 5};
        int min_element = arr28[0];
        int max_element = arr28[0];
        for (int num : arr28) {
            if (num < min_element) {
                min_element = num;
            }
            if (num > max_element) {
                max_element = num;
            }
        }
        int difference = max_element - min_element;
        System.out.println("Difference between the largest and smallest values: " + difference);

        //Task 29 - Write a Java program to compute the average value of an array of integers except the largest and smallest values.
        int[] arr29 = {1, 2, 3, 4, 5};
        int min_element2 = arr29[0];
        int max_element2 = arr29[0];
        int sum3 = 0;
        for (int num : arr29) {
            if (num < min_element2) {
                min_element2 = num;
            }
            if (num > max_element2) {
                max_element2 = num;
            }
            sum3 += num;
        }
        sum3 -= min_element2;
        sum3 -= max_element2;
        double average1 = (double) sum3 / (arr29.length - 2);
        System.out.println("Average value excluding the largest and smallest values: " + average1);

        //Task 32 - Write a Java program to check if an array of integers contains two specified elements 65 and 77.
        int[] arr32 = {1, 2, 3, 4, 5, 65, 77, 8, 9, 10};
        boolean contains65And77 = false;
        for (int num : arr32) {
            if (num == 65) {
                contains65And77 = true;
            }
        }
        if (contains65And77) {
            contains65And77 = false;
            for (int num : arr32) {
                if (num == 77) {
                    contains65And77 = true;
                }
            }
        }
        if (contains65And77) {
            System.out.println("Array contains both 65 and 77: " + contains65And77);
        } else {
            System.out.println("Array does not contain both 65 and 77: " + contains65And77);
        }

        //Task 41 - Write a Java program to find the smallest and second-smallest elements of a given array.
        int[] arr41 = {1, 2, 3, 4, 5};
        Arrays.sort(arr41);
        int min_elm = arr41[0];
        int second_min_element = arr41[1];
        System.out.println("Smallest element: " + min_elm);
        System.out.println("Second smallest element: " + second_min_element);

        /* Task 50
        Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element
        should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be
        the second minimum and so on. (most challengeable task for me)
         */
        int[] arr50 = {1, 5, 3, 7, 9, 2, 4, 6, 8, 10};
        Arrays.sort(arr50);
        int[] result = new int[arr50.length];
        int start = 0;
        int end = arr50.length - 1;
        int n = arr50.length;
        for (int i = 0; i < arr50.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr50[end--];
            } else {
                result[i] = arr50[start++];
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(result));

        //Totally I solved 30 problems for homework

    }
}