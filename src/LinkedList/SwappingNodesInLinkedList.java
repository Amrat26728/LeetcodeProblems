package LinkedList;

public class SwappingNodesInLinkedList {
    // problem
    // https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

    ////////// solution ////////////
//    public ListNode swapNodes(ListNode head, int k) {
//        ListNode temp = head;
//        List<Integer> list = new ArrayList<>();
//        while(temp != null){
//            list.add(temp.val);
//            temp = temp.next;
//        }
//        int val1 = list.get(k-1);
//        int val2 = list.get(list.size() - k);
//        list.set(k-1, val2);
//        list.set(list.size() - k, val1);
//
//        ListNode newHead = null;
//
//        for(int i = list.size() - 1; i >= 0; i--){
//            ListNode node = new ListNode(list.get(i));
//            if(newHead != null){
//                node.next = newHead;
//            }
//            newHead = node;
//        }
//        return newHead;
//    }
}
