
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class SingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list1 = new SingleLinkedList();
//[[1,4,5],[1,3,4],[2,6]]
        Node head1 = new Node(1);
        head1.next = new Node(4);
        head1.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node head3 = new Node(2);
        head3.next = new Node(6);
//        head3.next.next = new Node(5);

        Node[] list = new Node[3];
        list[0] = head1;
        list[1] = head2;
        list[2] = head3;

//        Node temp = reverseEvenLengthGroups(list1.head);
//
//        System.out.print("list: ");
//        while(temp != null){
//            System.out.print(temp.value + " -> ");
//            temp = temp.next;
//        }


    }

    private static class Node{
        private final int value;

        private Node next;

        private Node(int value){
            this.value = value;
            this.next = null;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
    private Node head;
    private Node tail;

    private int size;

    private SingleLinkedList(){
        this.size = 0;
    }
    // add element at the first position{

    private void addAtFirstPos(int value){
        Node node = new Node(value);

        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }
    // add element at the end by traversing through whole list

    private void addElementAtPos(int value, int pos){
        if (pos == 0){
            addAtFirstPos(value);
            return;
        }
        if (pos == size){
            addAtLast(value);
            return;
        }
        if(pos > size){
            System.out.println("Can not add at " + pos + " position.");
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++){
            temp = temp.next;
        }
        temp.next = new Node(value, temp.next);
        size++;
    }
    // add element at the last

    private void addAtLast(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    // delete first element

    private int deleteFirst(){
        if (isEmpty()){
            System.out.println("list is empty.");
            return -1;
        }
        int val = head.value;
        head = head.next;
        size--;
        if(head  == null){
            tail = null;
        }
        return val;
    }
    // delete at particular position

    private int deleteAtPos(int pos){
        if (pos == 0){
            return deleteFirst();
        }
        if (isEmpty()){
            System.out.println("list is empty;");
            return -1;
        }
        if (pos > size){
            System.out.println("Element does not exist.");
            return -1;
        }
        Node node = getNode(pos);
        int val = node.value;
        node.next = node.next.next;
        size--;
        return val;
    }

    private Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        return temp.next;
    }


    private boolean isEmpty(){
        return head == null;
    }

    // printing list

    private void printList(){
        System.out.print("List: ");
        for (Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.value + " -> ");
        }
        System.out.println("null");
    }

    // printing first element

    private void firstElement(){
        if (isEmpty()){
            System.out.println("list is empty.");
            return;
        }
        System.out.println("First element" + head.value);
    }

    // printing last element;

    private void lastElement(){
        if (isEmpty()){
            System.out.println("list is empty.");
            return;
        }
        System.out.println("Last element: " + tail.value);
    }

    // size of the list

    private void size(){
        System.out.println("Size: " + size);
    }

}
