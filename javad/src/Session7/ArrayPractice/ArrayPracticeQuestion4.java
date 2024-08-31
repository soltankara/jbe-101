package Session7.ArrayPractice;

public class ArrayPracticeQuestion4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 5};
        for (int container : arr) { // sort olunmamış arrayi çap edir
            System.out.print(container + " ");
        }
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) { // arrayi sort edir
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("-----------------------------");
        for (int container : arr) { // sort olunmuş arrayi çap edir
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Second largest element is : " + arr[arr.length - 2]); // array daxilində olan 2ci ən boyük ədədi çap edir
    }
}
