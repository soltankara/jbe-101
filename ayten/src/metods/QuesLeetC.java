package metods;

public class QuesLeetC {
    public static void main(String[] args) {
        int [][] arr={{2,3,4},{5,6,8},{9,7,1}};
        changingNiDegre(arr);
    }

    //    public static int sumUsingRecursive(int num){
//        if(num==0) return 0;
//        return num+sumUsingRecursive(num-1);
//    }
//    public static int sumOUsingLoop(int num){
//        int sum=0;
//        for(int i=0;i<=num;i++){
//            sum+=i;
//        }
    //   return sum;
//    }
    public static void changingNiDegre(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][arr.length-1 - i];
                arr[j][arr.length-1 - i] = temp;
            }

        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
