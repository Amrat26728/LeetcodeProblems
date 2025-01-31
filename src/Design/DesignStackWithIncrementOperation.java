package Design;

// problem
// https://leetcode.com/problems/design-a-stack-with-increment-operation/

public class DesignStackWithIncrementOperation {
    public static void main(String[] args) {
        DesignStackWithIncrementOperation stack = new DesignStackWithIncrementOperation(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    ////////////// solution ///////////////
    public DesignStackWithIncrementOperation(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
    }

    private Node head;
    private Node tail;
    private int size;
    private final int maxSize;

    private static class Node{
        private int val;
        private Node next;
        private Node prev;
        private Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public void display(){
        System.out.print("stack: ");
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " <- ");
            temp = temp.next;
        }
    }

    public void push(int x){
        if (size == maxSize){
            return;
        }
        Node node = new Node(x);
        if (head == null){
            head = node;
            tail = head;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public int pop(){
        if (head == null){
            return -1;
        }
        if (head.next == null){
            int val = head.val;
            head = null;
            tail = null;
            size--;
            return val;
        }
        int val = tail.val;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void increment(int k, int val){
        Node temp = head;
        if (size <= k){
            while (temp != null){
                temp.val = temp.val + val;
                temp = temp.next;
            }
        }else{
            for (int i = 0; i < k; i++) {
                temp.val = temp.val + val;
                temp = temp.next;
            }
        }
    }


}
