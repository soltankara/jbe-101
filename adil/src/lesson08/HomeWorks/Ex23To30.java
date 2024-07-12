package lesson08.HomeWorks;

public class Ex23 {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 8};
        int arr2[] = {2, 0, 4, 0, 8, 0, 16};
        int arr3[] = {4, 8, 14, 40};
        int[] array_nums = {50, 77, 12, 54, -11};
//        System.out.println(isEqual(arr1, arr2));
//        System.out.println(missingNumber(arr3));
//        commonElements(arr1, arr2, arr3);
//        zerosToTheEndOfArray(arr2);
//        for (int i : arr2) {
//            System.out.print(i);
//        }
        System.out.println(withoutTwoNumbers(array_nums, 0, -1));

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
        int min = arr[0];
        int max = arr[0];
        int sumArr = 0;
        for (int i : arr) {
            if (min > i) min = i;
            else if (max < i) max = i;
            sumArr += i;
        }
        int sum = 0;
        for (int i = min; i <= max; i++) {
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
        for (int i : arr) {
            if(i == a || i == b) return false;
        }
        return true;
    }

}
