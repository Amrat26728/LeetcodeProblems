package LinkedList;

public class SplitListToParts {
    // problem
    // https://leetcode.com/problems/split-linked-list-in-parts/

    ///////// solution ////////////
//    private static Node[] splitListToParts(Node head, int k){
//
//        Node[] arr = new Node[k];
//        if (head == null){
//            for (int j = 0; j < k; j++){
//                arr[j] = null;
//            }
//            return arr;
//        }
//
//        if (k == 1){
//            arr[0] = head;
//            return arr;
//        }
//
//        int size = 0;
//        Node temp = head;
//
//        while(temp != null){
//            size++;
//            temp = temp.next;
//        }
//
//        if (size < k){
//            for (int i = 0; i < size; i++) {
//                if (head != null){
//                    arr[i] = head;
//                    head = head.next;
//                    arr[i].next = null;
//                }
//            }
//            for (int j = size; j < k; j++) {
//                arr[j] = null;
//            }
//            return arr;
//        }
//
//        int eachPartSize = size / k;
//        int extraNodes = size % k;
//
//        for (int i = 0; i < k; i++) {
//            Node newHead = null;
//            Node tail = null;
//            int j = eachPartSize;
//            while (j > 0){
//                Node node = new Node(head.value);
//                if (newHead == null){
//                    newHead = node;
//                    tail = newHead;
//                }else{
//                    tail.next = node;
//                    tail = node;
//                }
//                head = head.next;
//                j--;
//            }
//            if (extraNodes > 0){
//                Node node = new Node(head.value);
//                tail.next = node;
//                tail = node;
//                extraNodes--;
//                head = head.next;
//            }
//            arr[i] = newHead;
//        }
//        return arr;
//    }
}
