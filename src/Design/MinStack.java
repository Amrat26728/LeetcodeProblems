package Design;

import java.util.Stack;

// problem
// https://leetcode.com/problems/min-stack/

//////////// solution /////////
public class MinStack {

    private final Stack<Integer> stack;
    private int min = Integer.MAX_VALUE;

    public MinStack(){
        stack = new Stack<>();
    }

    public void push(int val) {
        if(val <= min){
            stack.push(min);
            min = val;
        }
        stack.push(val);

    }

    public void pop() {
        int peek = stack.pop();
        if(peek == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
