package LinkedList;

public class PalindromeLinkedList {
    // problem
    // https://leetcode.com/problems/palindrome-linked-list/

    ////////////////// solution /////////////////
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        ListNode reversedList = reverseList(slow);
//        ListNode temp = head;
//
//        while(reversedList != null){
//            if(reversedList.val != temp.val){
//                return false;
//            }
//            temp = temp.next;
//            reversedList = reversedList.next;
//        }
//        return true;
//    }
//
//    static ListNode reverseList(ListNode node){
//        ListNode prev = null;
//        ListNode pres = node;
//        ListNode next = node.next;
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
