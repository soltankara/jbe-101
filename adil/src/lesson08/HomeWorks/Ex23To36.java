package lesson08.HomeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex23To36 {
    public static void main(String[] args) {
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        //23. Write a Java program to test two arrays' equality.
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static int missingNumber(int[] arr) {
        //24. Write a Java program to find a missing number in an array.
        int sumArr = 0;
        for (int i : arr) {
            sumArr += i;
        }
        int sum = 0;
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            sum += i;
        }
        return sum - sumArr;
    }

    public static void commonElements(int[] arr1, int[] arr2, int[] arr3) {
        //25. Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.
        for (int i : arr1) {
            for (int i1 : arr2) {
                if (i1 > i) break;
                if (i1 == i) {
                    for (int i2 : arr3) {
                        if (i2 > i) break;
                        if (i2 == i) {
                            System.out.print(i + " ");
                        }
                    }
                }
            }
        }
    }

    public static void zerosToTheEndOfArray(int[] arr) {
        //26. Write a Java program to move all 0's to the end of an array. Maintain the relative order of
        // the other (non-zero) array elements.
        int k = 0;
        for (int i : arr) {
            if (i != 0) arr[k++] = i;
        }
        while (k < arr.length) {
            arr[k++] = 0;
        }
    }

    public static boolean withoutTwoNumbers(int[] arr, int a, int b) {
        //30. Write a Java program to check if an array of integers is without 0 and -1.
        for (int i : arr) {
            if (i == a || i == b) return false;
        }
        return true;
    }

    public static List<Integer> consecutiveElements(int[] arr) {
        //34. Write a Java program to find the length of the longest consecutive elements sequence from
        // an unsorted array of integers.
        Arrays.sort(arr);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[j - 1] + 1) {
                    list.add(arr[j]);
                } else {
                    lists.add(list);
                    break;
                }
            }
        }
        int max_i = 0;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(max_i).size() < lists.get(i).size()) max_i = i;
        }
        return lists.get(max_i);
    }

    public static List<List<Integer>> triplets(int[] arr, int sum) {
        //36. Write a Java program to find all the distinct triplets such that the sum of all the three elements
        // [x, y, z (x ≤ y ≤ z)] equal to a specified number.
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int i1 = i + 1; i1 < arr.length - 1; i1++) {
                for (int i2 = i1 + 1; i2 < arr.length; i2++) {
                    if (arr[i] + arr[i1] + arr[i2] == sum) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[i1]);
                        list.add(arr[i2]);
                        lists.add(list);
                    }
                }
            }
        }
        return lists;
    }
}
