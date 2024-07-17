package Session8;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1,2,3));
    }
    static int sum(int... numbers){
        return sumRecursive(numbers,0);
        }
    private static int sumRecursive(int[] numbers,int index)  {
        if (index == numbers.length){
            return 0;
        }
        return numbers[index] + sumRecursive(numbers,index+1);
    }



    }

