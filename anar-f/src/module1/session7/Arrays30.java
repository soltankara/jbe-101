package module1.session7;

public class Arrays30 {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,3,4,5,6,7,8,9};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("the array contains 0 or -1 ");
        } else System.out.println("the array doesn't contain 0 or -1 ");

    }
}
