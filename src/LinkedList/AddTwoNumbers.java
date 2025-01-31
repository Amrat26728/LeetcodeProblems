package LinkedList;

// problem
// https://leetcode.com/problems/add-two-numbers/description/

public class AddTwoNumbers {

    //////////// solution ////////////
//    private static Node addTwoNumbers(Node list1, Node list2){
//        Node head = null;
//        int carry = 0;
//        while(list1 != null && list2 != null){
//            int sum = list1.value + list2.value + carry;
//            if (sum >= 10){
//                carry = sum/10;
//                Node node = new Node(sum % 10);
//                if (head == null){
//                    head = node;
//                }else{
//                    Node temp = head;
//                    while(temp.next != null){
//                        temp = temp.next;
//                    }
//                    temp.next = node;
//                }
//            }else{
//                Node node = new Node(sum);
//                if (head == null){
//                    head = node;
//                }else{
//                    Node temp = head;
//                    while(temp.next != null){
//                        temp = temp.next;
//                    }
//                    temp.next = node;
//                }
//                carry = 0;
//            }
//            list1 = list1.next;
//            list2 = list2.next;
//        }
//
//        Node temp = head;
//
//        while (temp.next != null){
//            temp = temp.next;
//        }
//
//        while(list1 != null){
//            int sum = list1.value + carry;
//            if(sum >= 10){
//                temp.next = new Node(sum % 10);
//                temp = temp.next;
//                carry = sum / 10;
//            }else{
//                temp.next = new Node(sum);
//                temp = temp.next;
//                carry = 0;
//            }
//            list1 = list1.next;
//        }
//
//        while(list2 != null){
//            int sum = list2.value + carry;
//            if(sum >= 10){
//                temp.next = new Node(sum % 10);
//                temp = temp.next;
//                carry = sum / 10;
//            }else{
//                temp.next = new Node(sum);
//                temp = temp.next;
//                carry = 0;
//            }
//            list2 = list2.next;
//        }
//
//        if(carry > 0){
//            temp.next = new Node(carry);
//        }
//
//        return head;
//    }
}
