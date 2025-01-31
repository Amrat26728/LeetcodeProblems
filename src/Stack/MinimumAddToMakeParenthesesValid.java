package Stack;

import java.util.Stack;

// problem
// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "))";
        System.out.println(minAdd(s));
    }

    //////// solution ///////////
    private static int minAdd(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()){
            if (ch == '('){
                stack.push(ch);
            }else {
                if (ch == ')'){
                    if (!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                }
            }
        }
        return stack.size();
    }
}
