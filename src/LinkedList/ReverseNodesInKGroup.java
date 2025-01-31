package LinkedList;

// problem
// https://leetcode.com/problems/reverse-nodes-in-k-group/

public class ReverseNodesInKGroup {

    /////////// solution /////////////
//    private static Node reverseKGroup(Node head, int k){
//
//        if (head == null || k == 1){
//            return head;
//        }
//
//        // reverse first k group
//        Node t = head;
//        for (int i = 0; i < k-1; i++) {
//            t = t.next;
//        }
//        Node temp = t.next;
//        t.next = null;
//        Node[] headTail = reverse(head);
//        head = headTail[0];
//        Node tail = headTail[1];
//
//        // reverse remaining k groups
//        Node t2 = temp;
//        while(t2 != null){
//            Node t3 = temp;
//            t2 = temp;
//            for (int i = 0; i < k-1; i++) {
//                if (t2 == null){
//                    break;
//                }
//                t2 = t2.next;
//            }
//            if (t2 == null){
//                break;
//            }
//            temp = t2.next;
//            t2.next = null;
//            Node[] newHeadTail = reverse(t3);
//            tail.next = newHeadTail[0];
//            tail = newHeadTail[1];
//        }
//
//        while (temp != null){
//            tail.next = temp;
//            temp = temp.next;
//            tail = tail.next;
//        }
//
//
//        return head;
//    }
//
//    private static Node[] reverse(Node node){
//        Node prev = null;
//        Node pres = node;
//        Node next = node.next;
//        while (pres != null){
//            pres.next = prev;
//            prev = pres;
//            pres = next;
//            if (next != null){
//                next = next.next;
//            }
//        }
//        return new Node[] {prev, node};
//    }
}

