package Queue;

// problem
// https://leetcode.com/problems/design-front-middle-back-queue/

///////////////////// solution with all methods of O(1) time complexity /////////////

public class DesignFrontMiddleBackQueue {
    public static void main(String[] args) {
        DesignFrontMiddleBackQueue queue = new DesignFrontMiddleBackQueue();

        queue.pushMiddle(1);
        queue.pushMiddle(2);
        queue.pushMiddle(3);
        queue.pushMiddle(4);
        queue.pushMiddle(5);
        queue.pushMiddle(6);

        System.out.println("front: " + queue.front());
        System.out.println("middle: " + queue.middle());
        System.out.println("back: " + queue.back());

        System.out.println(queue.popFront());
        System.out.println(queue.popFront());
        System.out.println(queue.popFront());
        System.out.println(queue.popFront());
        System.out.println(queue.popFront());

        System.out.println("front: " + queue.front());
        System.out.println("middle: " + queue.middle());
        System.out.println("back: " + queue.back());

        queue.display();

    }

    public void display(){
        Node temp = head;
        System.out.print("queue: ");
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

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

    private Node head;
    private Node middle;
    private Node back;
    int size;

    public DesignFrontMiddleBackQueue(){
        this.size = 0;
    }

    public int front(){
        return head.val;
    }

    public int middle(){
        return middle.val;
    }

    public int back(){
        return back.val;
    }

    public void pushFront(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            middle = head;
            back = head;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
        if (size % 2 == 0){
            middle = middle.prev;
        }
    }

    public void pushMiddle(int val){
        if (head == null || head.next == null){
            pushFront(val);
            return;
        }
        Node node = new Node(val);
        if (size == 2){
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
            middle = head.next;
            size++;
            return;
        }
        if (size % 2 == 0){
            node.next = middle.next;
            middle.next.prev = node;
            middle.next = node;
            node.prev = middle;
            middle = middle.next;
        }else{
            node.prev = middle.prev;
            middle.prev.next = node;
            node.next = middle;
            middle.prev = node;
            middle = middle.prev;
        }
        size++;
    }

    public void pushBack(int val){
        if (head == null){
            pushFront(val);
            return;
        }
        Node node = new Node(val);
        back.next = node;
        node.prev = back;
        back = node;
        size++;
        if (size % 2 != 0){
            middle = middle.next;
        }
    }

    public int popFront(){
        if (size == 0){
            return -1;
        }
        if (size == 1){
            int val = head.val;
            head = null;
            middle = null;
            back = null;
            size--;
            return val;
        }
        if (size == 2){
            int val = head.val;
            head = head.next;
            middle = head;
            size--;
            return val;
        }
        if (size == 3){
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
        if (size % 2 == 0){
            int val = head.val;
            head = head.next;
            middle = middle.next;
            size--;
            return val;
        }else{
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
    }

    public int popMiddle(){
        if (size == 0){
            return -1;
        }
        if (size <= 2){
            return popFront();
        }
        if (size == 3){
            int val = middle.val;
            head.next = head.next.next;
            head.next.prev = head;
            middle = head;
            size--;
            return val;
        }
        if (size % 2 == 0){
            int val = middle.val;
            middle.prev.next = middle.next;
            middle.next.prev = middle.prev;
            middle = middle.next;
            size--;
            return val;
        }else{
            int val = middle.val;
            middle.prev.next = middle.next;
            middle.next.prev = middle.prev;
            middle = middle.prev;
            size--;
            return val;
        }
    }

    public int popBack(){
        if (size == 0){
            return -1;
        }
        if (size == 1){
            return popFront();
        }
        if (size == 2){
            int val = back.val;
            back = back.prev;
            head.next = null;
            size--;
            return val;
        }
        if (size % 2 == 0){
            int val = back.val;
            back = back.prev;
            back.next = null;
            size--;
            return val;
        }else{
            int val = back.val;
            back = back.prev;
            back.next = null;
            middle = middle.prev;
            size--;
            return val;
        }
    }

}
