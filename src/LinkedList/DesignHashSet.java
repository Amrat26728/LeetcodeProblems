package LinkedList;

// problem
// https://leetcode.com/problems/design-hashset/

public class DesignHashSet {

    /////////// solution ////////////
    private static class Node{
        private final int key;
        private Node next;
        private Node(int key){
            this.key = key;
            this.next = null;
        }
    }

    private Node head;

    public void display(){
        Node temp = head;
        System.out.print("Map: ");
        while (temp != null){
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int key){
        Node node = new Node(key);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public boolean contains(int key){
        if (head == null){
            return false;
        }
        Node temp = head;
        while (temp != null){
            if (temp.key == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void remove(int key){
        if (head == null){
            return;
        }
        while (head.key == key){
            head = head.next;
        }
        if (head.next == null){
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null){
            if (temp.next.key == key){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
}
