package Session6;

public class HomeWorkChanges {
    public static void main(String[] args) {

        //Arrayin ikinci en boyuk elementinin tapilmasi(with one loop)
        int[] arr = {6, 3, 2, 4, 8};
        int max = arr[0];
        int max2 = arr[0];
        for (int number : arr) {
            if (number > max) {
                max2 = max;
                max = number;
            } else if (number > max2 && number != max) {
                max2 = number;

            }
        }
        System.out.println("Array-in ikinci en boyuk elementi: " + max2);


        //Array-in ikinci en kicik elementinin tapilmasi(with one loop)
        int[] arr1 = {6, 7, 2, 4, 8};
        int min = arr1[0];
        int min2 = arr1[0];
        for (int number : arr1) {
            if (number < min) {
                min2 = min;
                min = number;
            } else if (number < min2 && number != min) {
                min2 = number;

            }
        }
        System.out.println("Array-in ikinci en kicik elementi: " + min2);

    }
}
