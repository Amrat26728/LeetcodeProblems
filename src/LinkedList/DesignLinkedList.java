package LinkedList;

public class DesignLinkedList {

    // problem
    // https://leetcode.com/problems/design-linked-list/

    //////////// solution //////////////////////
    private static class Node {
        private int val;
        private Node next;
        private Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public DesignLinkedList(){
        this.size = 0;
    }

    public int get(int index){
        if (index > size - 1){
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = head;
        } else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val){
        if (head == null){
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val){
        if (index > size){
            return;
        }
        if (index == 0){
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        if (index == size){
            addAtTail(val);
        }else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void deleteAtIndex(int index){
        if (head == null){
            return;
        }
        if (index >= size){
            return;
        }
        if (index == 0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if (index == size - 1){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void printList(){
        Node temp = head;
        System.out.print("list: ");
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printHead(){
        System.out.println("head: " + head.val);
    }

    public void printTail(){
        System.out.println("tail: " + tail.val);
    }

    public static void main(String[] args) {
        DesignLinkedList list = new DesignLinkedList();

        list.addAtIndex(0, 7);
        list.addAtHead(1);

        list.printHead();
        list.printTail();
        list.addAtTail(9);
        list.addAtIndex(0,3);


        list.printTail();
        list.printHead();

        list.deleteAtIndex(3);
        list.deleteAtIndex(6);
        list.printHead();
        list.printTail();

        System.out.println(list.get(0));

        list.printList();

        System.out.println(list.size);

    }
}
