package Session6;

public class HomeWork3 {
    public static void main(String[] args) {
        //1.Reqem ve setir massivi cesidleyen program
        /*int[] numbers={2,4,3,5,6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


       String [] strings={"Aynur","Nermin","Emin","Zaur"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

         */


        //2.Arrayin elementlerinin cemlenmesi
       /* int[] number={2,5,7,8,9,13};
        int result=0;
        for(int i=0;i< number.length;i++){
            result+=number[i];}
        System.out.println(result);

        */
        //3.10x10 olcude matris
      /*int[][] arr=new int[10][10];
        for(int i=0;i<=10;i++){
            for(int j=0;j<10;j++){
                   System.out.printf("%2d",arr[i][j]);
            }
            System.out.println();
        }

       */


        //4.Arrayin elementlerinin ortalamasi
        /*int[] number={12,5,8,90,4,3};
        double sum=0;
        for(int i=0;i< number.length;i++){
            sum+=number[i];
        }
        System.out.println("Average:" + sum/ number.length);
        }

         */


        //5.Arrayda her hansi elementin olub olmadigini yoxlamaq
       /* int[] arr={4,6,9,0,3,5};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scanner.nextInt();
        boolean found=false;
        for(int i=0;i< arr.length;i++) {
            if(num==arr[i]){
                System.out.println("Array contains spesific value:" + arr[i]);
                found=true;
                break;

        }
        if(!found){
            System.out.println("Array doesnt contain spesific value");

        }

        */

        //6.Arrayin elementinin indeksinin tapilmasi
        /*int [] arr={1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        for(int i=0;i< arr.length;i++){
            if(num==arr[i]){
                System.out.println("Index of value:" + i);
            }

         */
        //7.Arraydan elementin silinmesi
      /*  int[] arr = {4, 6, 9, 0, 3, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to remove:");
        int num = scanner.nextInt();
        int indexToRemove = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            System.out.println("The number " + num + " is not in the array.");
        } else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != indexToRemove) {
                    newArr[j++] = arr[i];
                }
            }

            System.out.println("Array after removal: " + Arrays.toString(newArr));
        }

       */
        //8.Massivi kopyalamaq ucun proqram
        /*int[] originalArray={5,2,8,7};
        int[] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        System.out.println("Copied Array:");
        for (int value : copiedArray) {
            System.out.print(value + " ");
        }

         */

        //9.Arrayin istenilen indeksine element daxil edilmesi
        /*int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int Index_position = 4;
        int newValue = 7;
        System.out.println("Original Array : " + Arrays.toString(array));
        for (int i = array.length - 1; i > Index_position; i--) {
            array[i] = array[i - 1];
        }
        array[Index_position] = newValue;

        System.out.println("New Array: " + Arrays.toString(array));

         */


        //10.Arrayin en kicik ve en boyuk elementinin tapilmasi
       /* int[] numbers={2,6,4,5,9,0};
        int maxVaalue=numbers[0];
        int minValue=numbers[0];
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]>=maxVaalue){
                maxVaalue=numbers[i];
            }
            if(numbers[i]<=minValue){
                minValue=numbers[i];
            }
        }
        System.out.println(maxVaalue);
        System.out.println(minValue);

        */
        //11.Tam ededler massivini tersine cevirmek ucun proqram
       /* int[] num={2,5,7,9,11};
        for(int i= num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }

        */
        //12.Tam ededler massivinde dublikat deyerleri tapmaq ucun proqram
        /*int[] arr={2,5,5,6,3,7,7,8};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&& (i!=j)){
                    System.out.println("Duplicate elements:" + arr[j]);
                }
            }
        }

         */


        //13.String massivinde tekrarlanan elementlerin tapilmasi
        /*String[] string={"Samsung","Apple","Samsung","HP","Acer","Acer"};
        for(int i=0;i<string.length-1;i++){
            for(int j=i+1;j<string.length;j++){
                if((string[i]==string[j])&& (i!=j)){
                    System.out.println("Duplicate elements:" + string[j]);}}}

         */


        //17.Arrayin ikinci en boyuk elementinin tapilmasi
        /*int[] arr={6,3,2,4,8};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        int secondMax=arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]>=arr[0]){
                if(arr[i]==max){
                    continue;
                }
                secondMax=arr[i];
            }
        }
        System.out.println(secondMax);

         */

        //18.Arrayin ikinci en kicik elementinin tapilmasi
        /*int[] arr1={5,9,2,4,1};
        int min=arr1[0];
        for(int i=1;i< arr1.length;i++){
            if(arr1[i]<=min){
                min=arr1[i];
            }
        }
        int secondMin=arr1[0];
        for(int i=1;i< arr1.length;i++){
            if(arr1[i]<=arr1[0]){
                if(arr1[i]==min){
                    continue;
                }
                secondMin=arr1[i];
                break;
            }
        }
        System.out.println(secondMin);

         */


        //23.Iki arrayin beraberliyini test eden proqram
       /* int[] array1={1,2,3,4,5};
        int[] array2={1,2,3,4,5};
       System.out.println("array1 ve array2 beraberdi?");
        System.out.println(Arrays.equals(array1,array2));


        }

        */
        //24-Massivin eksik elementinin tapilmasi
        /*int[] array = {1, 2, 4, 5, 6};
        int n = array.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        int element = expectedSum - actualSum;
        System.out.println(element);

         */


        //27.Tam ededler massivinde tek ve cut ededlerin sayini tapan proqram
       /* int[] arr = {5, 2, 8, 7, 9, 6};

        int countOfEven = 0;
        int countOfOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countOfEven += 1;
            } else {
                countOfOdd += 1;
            }
        }

        
        System.out.println("Even numbers: " + countOfEven);
        System.out.println("Odd numbers: " + countOfOdd);

        */
        //28.Tam ededler massivinin en boyuk ve en kicik elementleri arasindaki ferqi tapan proqram
       /* int[] arr={10,5,6,3,9,12};
        int maxVaalue=arr[0];
        int minValue=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=maxVaalue){
                maxVaalue=arr[i];
            }
            if(arr[i]<=minValue){
                minValue=arr[i];
            }
        }
        int result=maxVaalue-minValue;
        System.out.println("En boyuk ve en kicik element arasindaki ferq:"+ result );

        */

        //29.En boyuk ve en kicik ededler xaric,tam ededler massivinin ortalamasini tapin
       /* int[] arr={10,5,6,3,9,12};
        int maxValue = arr[0];
        int minValue = arr[0];
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        for (int value : arr) {
            if (value != maxValue && value != minValue) {
                sum += value;
            }
        }
        int excludedCount = 2;
        double average = (double) sum / (arr.length - excludedCount);
        System.out.println(average);

        */

        //30.
       /* int[] arr1 = {10, 5, 6, 3, 9, 12};
        boolean  variable=true;
        for (int value : arr1) {
            if (value == 0 || value == -1){
                variable=false;
            }else{
                variable=true;

            }

            }
        if(variable){
        System.out.println("Array contains neither 0 or -1");

    }else{
            System.out.println("Array contains either 0 or -1");
        }

        */

    }
}























