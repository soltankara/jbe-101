package metods;

import java.util.Scanner;

public class IntToRom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
       // System.out.println(integerToRoman(num));
    }
//    public static String integerToRoman(int num){
//        String[] teklik={"","I","II","III","IV","V","VI","VII","VIII","IX"};
//        String[] onluq={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XM"};
//        String[] yuzluk={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
//        String [] minlik={"","M","MM","MMM"};
//        return minlik[num/1000]+yuzluk[num%1000/100]+onluq[num%100/10]+teklik[num%10];
//    }


}
