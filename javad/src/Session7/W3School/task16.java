package Session7.W3School;

public class task16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 5};
        System.out.print("Array -> ");
        for (int container : arr) {
            System.out.print(container + " ");
        }
        System.out.println("\n-----------------------------------");
        // Kodun bu hissəsində silinmə dedikdə dəyəri sıfırlamaq (=0) kimi yazdım. İləridə onu başqa kiçikölçülü massivə keçirəcək kod yazaram.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        System.out.print("New array -> ");
        for (int container : arr) {
            System.out.print(container + " ");
        }
    }
}
