package session6ArrayW3resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ArrayTasks {
    public static void main(String[] args) {
        //1. Write a Java program to sort a numeric array and a string array.

        int[] array1 = {1, 56, 7, 5, 8, 53, 3, 10};
        String[] array2 = {"alma", "armud", "heyva", "nar", "banan"};
        System.out.println("orijinal array1 :" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("sorted array1 :" + Arrays.toString(array1));
        System.out.println("orijinal array2 :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("sorted array2 :" + Arrays.toString(array2));
        //-------------------------------------------------------------------------------------
        //2. Write a Java program to sum values of an array.

        int[] array3 = {1, 2, 3, 6, 5};
        int sum2 = 0;
        for (int i = 0; i < array3.length; i++) {
            sum2 += array3[i];
        }
        System.out.println(sum2);
        //--------------------------------------------------------------------------------------
        //3. Write a Java program to print the following grid.
        //
        //Expected Output :
        //
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -
        //- - - - - - - - - -

        int[][] array4 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array4[i][j]);
            }
            System.out.println();
        }
        //-----------------------------------------------------------------------------------------
        //4. Write a Java program to calculate the average value of array elements.

        Scanner sc4 = new Scanner(System.in);
        System.out.print("enter the size of Array  : ");
        int size4 = sc4.nextInt();
        int[] array5 = new int[size4];
        int average;
        int sum1 = 0;
        for (int i = 0; i < size4; i++) {
            System.out.print("value " + (i + 1) + " : ");
            array5[i] = sc4.nextInt();
            sum1 += array5[i];
        }
        System.out.print("embedded array5 : ");
        for (int i = 0; i < size4; i++) {
            System.out.print(array5[i] + " ");
        }
        System.out.println();
        average = sum1 / size4;
        System.out.print("the value of average  :" + average);
        //-------------------------------------------------------------------------------------------
        //6. Write a Java program to find the index of an array element.
        Scanner sc6 = new Scanner(System.in);
        System.out.print("enter size of array  : ");
        int size6 = sc6.nextInt();
        int[] array7 = new int[size6];

        System.out.println("enter number for array  : ");
        for (int i = 0; i < size6; i++) {
            System.out.print("value " + (i + 1) + "  : ");
            array7[i] = sc6.nextInt();
        }
        System.out.print("enter number for checking :");
        int numberToCheck = sc6.nextInt();
        int index = -1;
        for (int i = 0; i < size6; i++) {
            if (array7[i] == numberToCheck) {
                index = i;
            }
        }
        System.out.print("embedded array   : ");
        for (int i = 0; i < size6; i++) {
            System.out.print(array7[i] + "  ");
        }
        System.out.println();
        if (index != -1) {
            System.out.println("number is located in  " + index + " index");
        } else {
            System.out.println("number is not located in this array");
        }
        //----------------------------------------------------------------------------------------------
        //7. Write a Java program to remove a specific element from an array.
        Scanner sc7 = new Scanner(System.in);
        System.out.print("enter the size of array  : ");
        int size7 = sc7.nextInt();
        int[] array8 = new int[size7];
        System.out.println("enter the element of array ");
        for (int i = 0; i < size7; i++) {
            System.out.print("element  " + (i + 1) + "  : ");
            array8[i] = sc7.nextInt();
        }
        System.out.println();
        System.out.print("embeded array  : ");
        for (int i = 0; i < size7; i++) {
            System.out.print(array8[i] + "  ");
        }
        System.out.println();
        int[] narray = new int[size7 - 1];
        System.out.print("enter the element which you want to remove  : ");
        int element1 = sc7.nextInt();
        int index1 = 0;
        for (int i = 0; i < size7; i++) {
            if (array8[i] != element1) {
                narray[index1++] = array8[i];
            }
        }
        if (index1 == size7 - 1) {
            System.out.println("element  : " + element1 + "   removed form array");
            System.out.print("new array   : ");
            System.out.println(Arrays.toString(narray));
        } else {
            System.out.println("elemenet   : " + element1 + " was not found in array");
        }
        //----------------------------------------------------------------------------------------------
        //8. Write a Java program to copy an array by iterating the array.
        Scanner sc8 = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int size8 = sc8.nextInt();
        int[] firstarray = new int[size8];
        System.out.println("enter the element for firstarray ");
        for (int i = 0; i < size8; i++) {
            System.out.print("elemenet " + (i + 1) + "  : ");
            firstarray[i] = sc8.nextInt();
        }
        System.out.println();
        int[] secondarray = new int[size8];
        for (int i = 0; i < size8; i++) {
            secondarray[i] = firstarray[i];
        }
        System.out.println("firstarray's elements were copied to seconarray ");
        System.out.println("first array  is  : " + Arrays.toString(firstarray));
        System.out.println("second array is  : " + Arrays.toString(secondarray));
        //-------------------------------------------------------------------------------------------
        //9. Write a Java program to insert an element (specific position) into an array.
        Scanner sc9 = new Scanner(System.in);
        System.out.print("enter the size of array  : ");
        int size9 = sc9.nextInt();
        int[] array9 = new int[size9];
        for (int i = 0; i < size9; i++) {
            System.out.print("element  " + (i + 1) + " : ");
            array9[i] = sc9.nextInt();
        }
        int[] newArray9 = new int[size9 + 1];
        System.out.print("enter element which you want to insert : ");
        int elementToInsert = sc9.nextInt();
        System.out.print("which position do you want to insert  (enter index (index start from 0))  : ");
        int position = sc9.nextInt();
        for (int i = 0, j = 0; i < size9 + 1; i++) {
            if (i == position) {
                newArray9[i] = elementToInsert;
            } else {
                newArray9[i] = array9[j++];
            }
        }
        System.out.println("array9 is  :" + Arrays.toString(array9));
        System.out.println("newarray9 is  :" + Arrays.toString(newArray9));
        //-----------------------------------------------------------------------------------------
        //  12. Write a Java program to find duplicate values in an array of integer values.
        Scanner sc12 = new Scanner(System.in);
        System.out.print("enter the size of array  :  ");
        int size0 = sc12.nextInt();
        int[] array12 = new int[size0];
        for (int i = 0; i < size0; i++) {
            System.out.print("element  " + (i + 1) + "  : ");
            array12[i] = sc12.nextInt();
        }
        System.out.println("the array which you created  :" + Arrays.toString(array12));
        System.out.print("dublicate element   : ");
        for (int i = 0; i < size0 - 1; i++) {
            for (int j = i + 1; j < size0; j++) {
                if (array12[i] == array12[j] && (i != j)) {
                    if (array12[i] == array12[i]) {

                    }
                }
            }
        }
        //-----------------------------------------------------------------------------------------------
        //13. Write a Java program to find duplicate values in an array of string values.
        Scanner sc13 = new Scanner(System.in);
        System.out.print("enter the size of array  :  ");
        int size13 = sc13.nextInt();
        String[] array13 = new String[size13];
        for (int i = 0; i < size13; i++) {
            System.out.print("element " + (i + 1) + "  : ");
            array13[i] = sc13.next();
        }
        System.out.println("the array which you created  :" + Arrays.toString(array13));
        System.out.print("dublicate element   : ");
        for (int i = 0; i < size13 - 1; i++) {
            for (int j = i + 1; j < size13; j++) {
                if ((array13[i].equals(array13[j])) && (i != j)) {
                    System.out.print(array13[i] + "  ");
                }
            }
        }
        //---------------------------------------------------------------------------------------
        //17. Write a Java program to find the second-largest element in an array.
        Scanner sc17 = new Scanner(System.in);
        System.out.print("enter the size of array  :  ");
        int size17 = sc17.nextInt();
        String[] array17 = new String[size17];
        for (int i = 0; i < size17; i++) {
            System.out.print("element " + (i + 1) + "  : ");
            array17[i] = sc17.next();
        }
        System.out.println("the array which you created  :" + Arrays.toString(array17));
        Arrays.sort(array17);
        int c = size17 - 1;
        while (array17[c] == array17[size17 - 1]) {
            c--;
        }
        System.out.println("the second largest element in array  :" + array17[c]);
        //-------------------------------------------------------------------------------------------
        //18. Write a Java program to find the second -smallest element in an array.
        Scanner sc18 = new Scanner(System.in);
        System.out.print("enter the size of array  :  ");
        int size18 = sc18.nextInt();
        String[] array18 = new String[size18];
        for (int i = 0; i < size18; i++) {
            System.out.print("element " + (i + 1) + "  : ");
            array18[i] = sc18.next();
        }
        System.out.println("the array which you created  :" + Arrays.toString(array18));
        Arrays.sort(array18);
        System.out.println(Arrays.toString(array18));
        int f = 0;
        while (array18[f] == array18[0]) {
            f++;
        }
        System.out.println("the second smallest element in array  :" + array18[f]);
        //-----------------------------------------------------------------------------------------
        //19. Write a Java program to add two matrices of the same size.
        Scanner sc19 = new Scanner(System.in);
        System.out.print("enter the first size of first matrix :");
        int size19first1 = sc19.nextInt();
        System.out.print("enter the second size of first matrix :");
        int size19first2 = sc19.nextInt();
        int[][] firstmatrix = new int[size19first1][size19first2];
        for (int i = 0; i < size19first1; i++) {
            for (int j = 0; j < size19first2; j++) {
                System.out.print("Element (" + (i + 1) + ", " + (j + 1) + ") : ");
                firstmatrix[i][j] = sc19.nextInt();
            }
        }
        System.out.print("enter the first size of second matrix :");
        int size19second1 = sc19.nextInt();
        System.out.print("enter the second size of second matrix :");
        int size19second2 = sc19.nextInt();
        int[][] secondmatrix = new int[size19second1][size19second2];
        for (int i = 0; i < size19second1; i++) {
            for (int j = 0; j < size19second2; j++) {
                System.out.print("Element (" + (i + 1) + ", " + (j + 1) + ") : ");
                secondmatrix[i][j] = sc19.nextInt();
            }
        }
        int[][] sum = new int[size19first1][size19first2];
        for (int i = 0; i < size19first1; i++) {
            for (int j = 0; j < size19first2; j++) {
                sum[i][j] = firstmatrix[i][j] + secondmatrix[i][j];
            }
        }
        System.out.println("the first matrix :" + Arrays.deepToString(firstmatrix));
        System.out.println("the second matrix :" + Arrays.deepToString(secondmatrix));
        System.out.println("the sum of two matrix  :" + Arrays.deepToString(sum));
        //------------------------------------------------------------------------------------
        //20. Write a Java program to convert an array to an ArrayList.
        Scanner sc20 = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size20 = sc20.nextInt();
        sc20.nextLine();
        String[] array20 = new String[size20];
        for (int i = 0; i < size20; i++) {
            System.out.print("element " + (i + 1) + " : ");
            array20[i] = sc20.nextLine();
        }
        System.out.println("the array :" + Arrays.toString(array20));
        List<String> arraylist = Arrays.asList(array20);
        System.out.println("arraylist  : " + arraylist);
        //--------------------------------------------------------------------------------
        //21.Write a Java program to convert an ArrayList to an array.
        Scanner sc21 = new Scanner(System.in);
        System.out.print("enter the size of array list : ");
        int size21 = sc21.nextInt();
        sc21.nextLine();
        List<String> arraylistt = new ArrayList<>();
        for (int i = 0; i < size21; i++) {
            System.out.print("element " + (i + 1) + " : ");
            String element = sc21.nextLine();
            arraylistt.add(element);
        }
        System.out.println("the arraylist  :" + arraylistt);
        String[] array21 = arraylistt.toArray(new String[0]);
        System.out.println("the array  :" + Arrays.toString(array21));
    }
}