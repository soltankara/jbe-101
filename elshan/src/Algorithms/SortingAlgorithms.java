package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("After");
        // Bubble Sort O(n^2)
//        System.out.println("Bubble Sort: ");
//        System.out.println(Arrays.toString(bubbleSort(numbers)));
        // Selection Sort O(n^2)
//        System.out.println("Selection Sort: ");
//        System.out.println(Arrays.toString(selectionSort(numbers)));
        // Merge Sort O(nlogn)
//        System.out.println("Merge Sort: ");
//        mergeSort(numbers);
//        System.out.println(Arrays.toString(numbers));
        // Quick Sort O(nlogn)
        System.out.println("Quick Sort: ");
        quickSort(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }


    private static int[] bubbleSort(int[] numbers) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return numbers;
    }

    private static int[] selectionSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[indexOfMin];
            numbers[indexOfMin] = temp;
        }
        return numbers;
    }

    private static void mergeSort(int[] inputArray) {
        int midIndex = inputArray.length / 2;
        if (inputArray.length < 2) {
            return;
        }
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputArray.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputArray.length; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }
        // Recursive
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        // Merging
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int i = 0; // for left half
        int j = 0; // for right half
        int k = 0; // for merged array
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftHalf.length) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightHalf.length) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void quickSort(int[] inputArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex){
            return;
        }
        int pivot = inputArray[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (inputArray[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (inputArray[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(inputArray,leftPointer,rightPointer);
        }
        swap(inputArray,leftPointer,highIndex);

        quickSort(inputArray,lowIndex,leftPointer-1);
        quickSort(inputArray,leftPointer+1,highIndex);
    }
    private static void swap(int[] array,int index1,int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
