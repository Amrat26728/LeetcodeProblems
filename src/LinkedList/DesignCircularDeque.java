package LinkedList;

// problem
// https://leetcode.com/problems/design-circular-deque/

public class DesignCircularDeque {

    //////// solution /////
    private static class Node{
        private final int value;
        private Node next;
        private Node prev;
        private Node(int val){
            this.value = val;
            this.next = null;
            this.prev = null;
        }
    }

    private int size;
    private final int maxSize;

    private Node head;
    private Node rear;

    public DesignCircularDeque(int size){
        this.maxSize = size;
        this.size = 0;
    }

    public boolean insertFront(int value){
        if (isFull()){
            return false;
        }
        Node node = new Node(value);
        if (head == null){
            head = node;
            rear = head;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
        return true;
    }

    public boolean insertLast(int value){
        if (isFull()){
            return false;
        }
        if (head == null){
            return insertFront(value);
        }
        Node node = new Node(value);
        rear.next = node;
        node.prev = rear;
        rear = node;
        size++;
        return true;
    }

    public int getFront(){
        if (isEmpty()){
            return -1;
        }
        return head.value;
    }

    public int getRear(){
        if (isEmpty()){
            return -1;
        }
        return rear.value;
    }

    public boolean deleteFront(){
        if (isEmpty()){
            return false;
        }
        if (size == 1){
            head = null;
            rear = null;
        }else{
            head.next.prev = null;
            head = head.next;
        }
        size--;
        return true;
    }

    public boolean deleteLast(){
        if (isEmpty()){
            return false;
        }
        if (size == 1){
            head = null;
            rear = null;
        }else{
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return true;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= maxSize;
    }

    public void display(){
        System.out.print("deque: ");
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
