package lesson08.HomeWorks;

public class Ex23To30 {
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

}
