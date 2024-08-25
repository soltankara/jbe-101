//273. Integer to English Words
package Session17_Leetcode.Hard;
public class IntegerToEnglishWords {
    private final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int number) {
        if (number == 0)
            return "zero";
        return changer(number);
    }

    public String changer(int number) {
        StringBuilder result = new StringBuilder();
        if (number < 20) {
            result.append(belowTwenty[number]);
        } else if (number < 100) {
            result.append(tens[number / 10]).append(" ").append(belowTwenty[number % 10]);
        } else if (number < 1000) {
            result.append(changer(number / 100)).append(" Hundred ").append(changer(number % 100));
        } else if (number < 1000000) {
            result.append(changer(number / 1000)).append(" Thousand ").append(changer(number % 1000));
        } else if (number < 1000000000) {
            result.append(changer(number / 1000000)).append(" Million ").append(changer(number % 1000000));
        } else {
            result.append(changer(number / 1000000000)).append(" Billion ").append(changer(number % 1000000000));
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        IntegerToEnglishWords obj = new IntegerToEnglishWords();
        System.out.println(obj.numberToWords(123));
        System.out.println(obj.numberToWords(21));
        System.out.println(obj.numberToWords(13));
        System.out.println(obj.numberToWords(122343));
    }
}
