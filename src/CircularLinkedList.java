
public class CircularLinkedList {

    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
    }

    private Node head;
    private int size;

    public CircularLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        head = node;
        size++;
    }

    public void insert(int value) {
        Node node = new Node(value);

        if(head == null){
            head = node;
            node.next = head;
            size++;
        }else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public int deleteFirst(){
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        int val = head.value;
        head = head.next;
        temp.next = head;
        size--;
        return val;
    }

    public int delete(int value){
        if(head.value == value){
            return deleteFirst();
        }
        Node temp = head;
        while (temp.next != head){
            if (temp.next.value == value){
                int val = temp.next.value;
                temp.next = temp.next.next;
                size--;
                return val;
            }
            else{
                temp = temp.next;
            }
        }
        return -1;
    }

    public void display(){
        Node node = head;
        while(node.next != head){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println(node.value + "->head");
    }

    public void size(){
        System.out.println("Size: " + size);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(4);
        list.insert(5);
        list.insert(16);
        list.insert(18);

        list.insertFirst(3);
        list.insertFirst(-2);
        list.insertFirst(-15);

        list.display();
        list.size();

        System.out.println(list.delete(-15));
        System.out.println(list.delete(-5));

        list.insertFirst(6);
        list.insertFirst(-23);

        list.display();
        list.size();


    }
}
