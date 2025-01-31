package Queue;

import java.util.LinkedList;
import java.util.Queue;

// problem
// https://leetcode.com/problems/implement-stack-using-queues/

public class ImplementStackUsingTwoQueues {

    public static void main(String[] args) {

    }

    /////// solution //////////////

    private final Queue<Integer> first;
    private final Queue<Integer> second;

    ImplementStackUsingTwoQueues(){
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x){
        while (!empty()){
            second.add(first.remove());
        }
        first.add(x);
        while (!second.isEmpty()){
            first.add(second.remove());
        }
    }

    public int pop(){
        if (empty()){
            return -1;
        }
        return first.remove();
    }

    public int top(){
        if (empty()){
            return -1;
        }
        return first.peek();
    }

    public boolean empty(){
        return first.isEmpty();
    }
}
