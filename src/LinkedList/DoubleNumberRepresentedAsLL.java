package LinkedList;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/

public class DoubleNumberRepresentedAsLL {


    //////////// solution //////////////
//    private static Node doubleIt(Node head){
//        List<Integer> list = new ArrayList<>();
//
//        SingleLinkedList.Node temp = head;
//        while(temp != null){
//            list.add(temp.value);
//            temp = temp.next;
//        }
//
//        int carry = 0;
//        Node newList = null;
//        for(int i = list.size() - 1; i >= 0; i--){
//            int num = list.get(i) * 2 + carry;
//            int digit = num % 10;
//            carry = num / 10;
//            Node node = new Node(digit);
//            if(newList != null){
//                node.next = newList;
//            }
//            newList = node;
//        }
//        if(carry > 0){
//            Node node = new Node(carry);
//            node.next = newList;
//            newList = node;
//        }
//        return newList;
//    }
}
