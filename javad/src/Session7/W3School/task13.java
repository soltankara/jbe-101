package Session7.W3School;

public class task13 {
    public static void main(String[] args) {
        String[] arr = {"BMW","Mercedes","Audi","Lamborghini","Lada","Bugatti","Audi"};
        System.out.print("array -> ");
        for (String continer : arr) {
            System.out.print(continer + " | ");
        }
        System.out.println("\n----------------------------");
        String duplicatedValue="";
        int it=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    duplicatedValue = arr[i];
                    it++;
                }
            }


        }
        if (it>0)
            System.out.println("\""+duplicatedValue + "\" is duplicate.");
        else {
            System.out.print("There is not duplicate");
        }
    }
}
