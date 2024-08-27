// 20. Valid Parentheses
package Session17_Leetcode.Easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[')
                stack.push(current);

            else if (current == ')' || current == '}' || current == ']') {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if (current == ')' && top != '(' || current == '}' && top != '{' || current == ']' && top != '[')
                    return false;

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("["));
        System.out.println(obj.isValid("]"));
        System.out.println(obj.isValid("[)"));
        System.out.println(obj.isValid("[]"));
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("{}"));
    }
}
