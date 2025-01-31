package LinkedList;

// problem
// https://leetcode.com/problems/design-hashmap/

public class DesignHashMap {

    //////////// solution ////////////
    private static class Node{
        private final int key;
        private int val;
        private Node next;
        private Node(int key, int val){
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }

    private Node head;

    public void display(){
        Node temp = head;
        System.out.print("Map: ");
        while (temp != null){
            System.out.print("(" + temp.key + ", " + temp.val + ") -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void put(int key, int value){
        Node node = new Node(key, value);
        if (head == null){
            head = node;
        }else{
            Node temp = head;
            while (temp.next != null){
                if (temp.key == key){
                    temp.val = value;
                    break;
                }
                temp = temp.next;
            }
            if (temp.key == key){
                temp.val = value;
            }else{
                temp.next = node;
            }
        }
    }

    public int get(int key){
        if (head == null){
            return -1;
        }
        Node temp = head;
        while (temp != null){
            if (temp.key == key){
                return temp.val;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void remove(int key){
        if (head == null){
            return;
        }
        if (head.key == key){
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            if (temp.next.key == key){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }
}
