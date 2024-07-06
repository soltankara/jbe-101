package src.session5.JavaExercises;
import java.util.Scanner;
public class JavaEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);
        String letter;
        if (Character.isAlphabetic(alphabet)){
            if (isVowel(alphabet)) letter = " is vowel";
            else letter = " is consonant";
            System.out.println("Input letter" + letter);
        }
        else System.out.println("be careful");
    }
    public static boolean isVowel(char alphabet){
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        for(char vowel : vowels){
            if (vowel == alphabet) return true;
        }
        return false;
    }
}
