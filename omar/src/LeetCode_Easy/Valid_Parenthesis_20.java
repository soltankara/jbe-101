package LeetCode_Easy;

import java.util.Scanner;
import java.util.Stack;



public class Valid_Parenthesis_20 {
    public static void main(String[] args) {
        isValid("(){}[]");
    }
    public static boolean isValid(String s) {
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();


    }
}
