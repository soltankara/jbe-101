//12. Integer to Roman
package Session17_Leetcode.Medium;

public class IntegerToRoman {
    public String intToRoman(int number) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        StringBuilder str = new StringBuilder();
        while (number > 0) {
            if (number >= numbers[i]) {
                str.append(romanSymbols[i]);
                number -= numbers[i];
            } else {
                i++;
            }
        }
        return str.toString();

        /*
                second solution (interesting)

                String[] M = {"", "M", "MM", "MMM"};
                String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
                String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
                String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
                return M[number / 1000] + C[(number % 1000) / 100] + X[(number % 100) / 10] + I[number % 10];
        */

    }

    public static void main(String[] args) {
        IntegerToRoman obj = new IntegerToRoman();
        System.out.println(obj.intToRoman(19));
        System.out.println(obj.intToRoman(39));
        System.out.println(obj.intToRoman(1001));
    }
}
