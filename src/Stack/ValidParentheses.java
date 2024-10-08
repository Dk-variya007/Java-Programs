package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            //opening
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }
            //closing
            else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String str = "({}[])";//true
        System.out.println(isValid(str));
        String str1="(}{";//false
        System.out.println(isValid(str1));
    }
}
