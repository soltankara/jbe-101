package Session7.W3School;

public class task14 {
    public static void main(String[] args) {
        String [] arr = {"UK","GER","USA","RU","AZ","BR"};
        String [] arr2 = {"BE","CA","EG","AZ"};
        System.out.print("Array 1 -> ");
        for (String container : arr){
            System.out.print(container+" | ");
        }
        System.out.print("\nArray 2 -> ");
        for (String container : arr2){
            System.out.print(container+" | ");
        }
        System.out.println("\n-----------------------------------");
        int it = 0;
        for(String containerArr1 : arr){
            for(String containerArr2 : arr2){
                if(containerArr1.equalsIgnoreCase(containerArr2)){
                    System.out.println("common value -> \""+ containerArr1+"\"");
                    it++;
                }
            }
        }
        if(it==0) System.out.println("There is not common value");

    }
}
