package Session7.W3School;

public class task2 {
    public static void main(String[] args) {
        double[] arr = {4.133, -4564, 1960, 6342.5321, -5133, 999, 6413.243};
        double sum = 0;
        for (double container : arr) {
            System.out.print(container + " | ");
            sum += container;
        }
        System.out.print("\n --------------------------------------------- \n The sum of array is : " + sum + "\n\n");


    }
}
