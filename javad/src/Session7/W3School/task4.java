package Session7.W3School;

public class task4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum=0;
        double average;
        for(int container : arr){
            System.out.print(container+" ");
            sum+=container;
        }
        System.out.println("\n--------------------------------------------");
        average=(double) sum/arr.length;
        System.out.println("Sum -> "+sum);
        System.out.println("Average -> "+average);
    }
}
