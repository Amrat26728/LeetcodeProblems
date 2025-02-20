package Stack;

import java.util.Stack;

// problem
// https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "[{}]";
        System.out.println(isValid(str));
    }

    ////////// solution ///////////
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if (ch == ')'){
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
                if (ch == '}'){
                    if (stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if (ch == ']'){
                    if (stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
