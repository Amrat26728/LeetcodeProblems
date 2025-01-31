package LinkedList;

// problem
// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

public class MaximumTwinSumOfLL {

    /////////// solution //////////////
//    public static int public static int maxTwinSum(Node head){
//        Node slow = head;
//        Node fast = head;
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        Node reversed = reverse(slow);
//        int maxSum = head.value + reversed.value;
//        head = head.next;
//        reversed = reversed.next;
//        while (reversed != null){
//            int sum = head.value + reversed.value;
//            if (sum > maxSum){
//                maxSum = sum;
//            }
//            head = head.next;
//            reversed = reversed.next;
//        }
//        return maxSum;
//    }
//
//    private static Node reverse(Node node){
//        Node prev = null;
//        Node pres = node;
//        Node next = node.next;
//
//        while (pres != null){
//            pres.next = prev;
//            prev = pres;
//            pres = next;
//            if (next != null){
//                next = next.next;
//            }
//        }
//        return prev;
//    }

}
