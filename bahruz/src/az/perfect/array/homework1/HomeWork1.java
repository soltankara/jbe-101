package az.perfect.array.homework1;

public class HomeWork1 {

    public static void main(String[] args) {

        //HomeWork1

        //Question1
        int a[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);


        //Question2
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);


        //Question3
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();


        //Question4
        int max1 = a[1];
        for (int i = 0; i < a.length; i++) {
            if (max1 < a[i] && a[i] != max) {
                max1 = a[i];
            }

        }
        System.out.println(max1);


        //Question5
        int firstindex = 1;
        int secondindex = 3;

        int temp = a[firstindex];
        a[firstindex] = a[secondindex];
        a[secondindex] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
