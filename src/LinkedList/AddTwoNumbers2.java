package LinkedList;

// problem
// https://leetcode.com/problems/add-two-numbers-ii/

public class AddTwoNumbers2 {

    ///////////// solution /////////////////
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
//        List<Integer> list1= new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//
//        while(l1 != null){
//            list1.add(l1.val);
//            l1 = l1.next;
//        }
//
//        while(l2 != null){
//            list2.add(l2.val);
//            l2 = l2.next;
//        }
//
//        ListNode head = null;
//        int carry = 0;
//        if (list1.size() == list2.size()){
//            for (int i = list1.size() - 1; i >= 0; i--) {
//                int sum = list1.get(i) + list2.get(i) + carry;
//                carry = sum / 10;
//                int rem = sum % 10;
//                head = insertNode(rem, head);
//            }
//        } else if (list1.size() > list2.size()){
//            int list2Index = list1.size() - list2.size();
//            for (int i = list1.size() - 1; i >= list2Index; i--) {
//                int sum = list1.get(i) + list2.get(i - list2Index) + carry;
//                int rem = sum % 10;
//                carry = sum / 10;
//                head = insertNode(rem, head);
//            }
//        } else{
//            int list1Index = list2.size() - list1.size();
//            for (int i = list2.size() - 1; i >= list1Index; i--) {
//                int sum = list2.get(i) + list1.get(i - list1Index) + carry;
//                int rem = sum % 10;
//                carry = sum / 10;
//                head = insertNode(rem, head);
//            }
//        }
//        if (list1.size() > list2.size()){
//            for (int i = list1.size() - list2.size() - 1; i >= 0; i--) {
//                int sum = list1.get(i) + carry;
//                int rem = sum % 10;
//                carry = sum / 10;
//                ListNode node = new ListNode(rem);
//                node.next = head;
//                head = node;
//
//            }
//        }
//        if (list2.size() > list1.size()){
//            for (int i = list2.size() - list1.size() - 1; i >= 0; i--) {
//                int sum = list2.get(i) + carry;
//                int rem = sum % 10;
//                carry = sum / 10;
//                ListNode node = new ListNode(rem);
//                node.next = head;
//                head = node;
//            }
//        }
//        if (carry > 0){
//            ListNode node = new ListNode(carry);
//            node.next = head;
//            head = node;
//        }
//        return head;
//    }
//
//    private static ListNode insertNode(int value, ListNode head){
//        ListNode node = new ListNode(value);
//        if (head != null) {
//            node.next = head;
//        }
//        head = node;
//        return head;
//    }
}
