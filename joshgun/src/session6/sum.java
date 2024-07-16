package session6;

//2 - Write a Java program to sum values of an array.
public class sum {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int sum=0;
        for (int num : array){
            sum+=num;
        }
        System.out.println(sum);
    }
}
