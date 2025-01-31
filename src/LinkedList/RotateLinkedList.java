package LinkedList;

public class RotateLinkedList {
    // problem
    // https://leetcode.com/problems/rotate-list/

    ///////// solution //////////////
//    private static Node rotate(Node head, int k){
//
//        if(head == null || head.next == null){
//            return head;
//        }
//
//        Node temp = head;

//        // calculate size of list
//        int size = 0;
//        Node fast = head;
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            size += 2;
//        }
//        if (fast != null && fast.next == null){
//            size++;
//        }

//        // calculate remainder
//        int rem = k % size;

//        // if remainder is 0 return list
//        if (rem == 0){
//            return head;
//        }
//
//        // reverse nodes size - rem
//        Node temp2 = head;
//        for (int i = 0; i < size - rem - 1; i++) {
//            temp2 = temp2.next;
//        }
//        Node reversed = reverseList(temp2.next);
//        temp2.next = null;
//
//        // rotate list
//        while (reversed != null){
//            // rotate without creating new node
//            Node ex = reversed.next;
//            reversed.next = head;
//            head = reversed;
//            reversed = ex;
//
//            // rotate with creating new node
//            Node node = new Node(reversed.value);
//            node.next = head;
//            head = node;
//            reversed = reversed.next;
//        }
//        return head;
//    }
//
//
//    private static Node reverseList(Node node){
//        Node prev = null;
//        Node pres = node;
//        Node next = node.next;
//
//        while(pres != null){
//            pres.next = prev;
//            prev = pres;
//            pres = next;
//            if(next != null){
//                next = next.next;
//            }
//        }
//        return prev;
//    }
}
