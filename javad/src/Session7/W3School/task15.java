package Session7.W3School;

public class task15 {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,3,4,5};
        int [] arr2 = {341,-35,935,5,9999};
        System.out.print("Array 1 -> ");
        for (int container : arr){
            System.out.print(container+" ");
        }
        System.out.print("\nArray 2 -> ");
        for (int container : arr2){
            System.out.print(container+" ");
        }
        System.out.println("\n-----------------------------------");
        int it = 0;
        for(int containerArr1 : arr){
            for(int containerArr2 : arr2){
                if(containerArr1==containerArr2){
                    System.out.println("common value -> "+ containerArr1);
                    it++;
                }
            }
        }
        if(it==0) System.out.println("There is not common value");

    }
}
