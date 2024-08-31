package Session7.W3School;

public class task12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 4, 0};
        System.out.print("array -> ");
        for (int continer : arr) {
            System.out.print(continer + " ");
        }
        System.out.println("\n----------------------------");
        int duplicatedValue=-1,it=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicatedValue = arr[i];
                   it++;
                }
            }


        }
        if (it>0)
            System.out.println(duplicatedValue + " is duplicate.");
        else {
            System.out.print("There is not duplicate");
        }
    }
}
