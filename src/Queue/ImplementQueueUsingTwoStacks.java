package Queue;

import java.util.Stack;

// problem
// https://leetcode.com/problems/implement-queue-using-stacks/

//////////// solution ////////////////

public class ImplementQueueUsingTwoStacks {
    private final Stack<Integer> first;
    private final Stack<Integer> second;

    ImplementQueueUsingTwoStacks(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int val){
        while (!isEmpty()){
            second.push(first.pop());
        }

        first.push(val);

        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("queue is empty.");
            return -1;
        }
        return first.pop();
    }

    public int peek(){
        return first.peek();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}
