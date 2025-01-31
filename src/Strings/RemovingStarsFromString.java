package Strings;

// problem
// https://leetcode.com/problems/removing-stars-from-a-string/

import java.util.Stack;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "u*ensso****x*q";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty()){
                char ch = stack.getLast();
                if (s.charAt(i) == '*' && ch != '*'){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.removeFirst());
        }
        return ans.toString();
    }
}
