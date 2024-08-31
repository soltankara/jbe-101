package Session7.W3School;

public class task1 {
    public static void main(String[] args) {
        int[] numericArr = {341, 4235, 634, 212, 3221, 324, 5213, 75765, 896, 2111, 556, 0, 11};
        String[] stringArr = {"Germany", "Turkey", "Russia", "USA", "UK", "China", "Japan", "Azerbaijan"};
        for (int container : numericArr) {
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
        for (String container : stringArr) {
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
        int temp;
        for (int i = 0; i < numericArr.length - 1; i++) { // arrayi sort edir
            for (int j = i + 1; j < numericArr.length; j++) {
                if (numericArr[i] > numericArr[j]) {
                    temp = numericArr[j];
                    numericArr[j] = numericArr[i];
                    numericArr[i] = temp;
                }
            }
        }
        System.out.print("New numeric array -> ");
        for (int container : numericArr) {
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
        String template;
        for (int i = 0; i < stringArr.length - 1; i++) { // arrayi sort edir
            for (int j = i + 1; j < stringArr.length; j++) {
                if (stringArr[i].compareTo(stringArr[j]) > 0) {
                    template = stringArr[j];
                    stringArr[j] = stringArr[i];
                    stringArr[i] = template;
                }
            }
        }
        System.out.print("New string array -> ");
        for (String container : stringArr) {
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println();

    }
}
