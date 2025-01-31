package LinkedList;

// problem
// https://leetcode.com/problems/remove-nodes-from-linked-list/

public class RemoveNodesFromLinkedList {
    public static void main(String[] args) {
        RemoveNodesFromLinkedList ll = new RemoveNodesFromLinkedList();
        ll.insert(5);
        ll.insert(1);
        ll.insert(4);
        ll.insert(1);
        ll.insert(2);
        ll.insert(1);
        ll.insert(3);
        System.out.println();
        Node newHead = ll.removeNodes(ll.head);
        while (newHead != null){
            System.out.print(newHead.value + ",");
            newHead = newHead.next;
        }
    }

    private class Node{
        private int value;
        private Node next;
        private Node(int val){
            this.value = val;
        }
    }

    private Node head;

    public void insert(int val){
        if (head == null){
            head = new Node(val);
            return;
        }
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public Node removeNodes(Node head){
        Node reversed = reverse(head);
        Node temp = reversed.next;
        Node newHead = reversed;
        while (temp != null){
            if (newHead.value <= temp.value){
                newHead.next = temp;
                newHead = newHead.next;
            }
            temp = temp.next;
        }
        newHead.next = null;
        return reverse(reversed);
    }
    private Node reverse(Node head){
        Node prev = null;
        Node pres = head;
        Node next = head.next;
        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }
}
