package Queue;

// problem
// https://leetcode.com/problems/design-circular-queue/

public class DesignCircularQueue {

    public static void main(String[] args) {
    }

    ////////////////// solution //////////////
    private static class Node{
        private final int value;
        private Node next;
        private Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    private int value;
    private Node head;
    private Node tail;
    private int size;
    private final int maxSize;

    public DesignCircularQueue(int k){
        this.maxSize = k;
        this.size = 0;
    }

    public boolean enQueue(int value){
        if (isFull()){
            return false;
        }
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = head;
            tail.next = head;
            size++;
            return true;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
        return true;
    }

    public boolean deQueue(){
        if (isEmpty()){
            return false;
        }
        if (size == 1){
            head = null;
            tail = null;
            size--;
            return true;
        }
        head = head.next;
        tail.next = head;
        size--;
        return true;
    }

    public int front(){
        if (isEmpty()){
            return -1;
        }
        return head.value;
    }

    public int rear(){
        if (isEmpty()){
            return -1;
        }
        return tail.value;
    }

    public boolean isFull(){
        return size >= maxSize;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void display(){
        System.out.print("queue: ");
        Node temp = head;
        while (head != null && temp.next != head){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        if (head != null){
            System.out.println(temp.value + " -> head");
        }
    }
}
