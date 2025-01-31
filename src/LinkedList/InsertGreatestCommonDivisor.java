package LinkedList;


// problem
// https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
public class InsertGreatestCommonDivisor {

    /////////////////// solution ////////////////////
//    private static Node insertGreatestCommonDivisors(Node head){
//        if(head.next == null){
//            return head;
//        }
//
//        int gcd = gcd(head.value, head.next.value);
//
//        Node node = new Node(gcd);
//        Node temp = head.next;
//        head.next = node;
//        node.next = temp;
//
//        Node temp1 = head.next.next;
//
//        while (temp1.next != null){
//            int grstCommonDiv = gcd(temp1.value, temp1.next.value);
//            Node node1 = new Node(grstCommonDiv);
//            Node t = temp1.next;
//            temp1.next = node1;
//            node1.next = t;
//            temp1 = temp1.next.next;
//        }
//
//        return head;
//    }
//
//    private static int gcd(int val1, int val2){
//        int gcd = 1;
//        int i = 2;
//        while(i <= val1 && i <= val2){
//            if (val1 % i == 0 && val2 % i == 0){
//                gcd = i;
//            }
//            i++;
//        }
//        return gcd;
//    }
}
