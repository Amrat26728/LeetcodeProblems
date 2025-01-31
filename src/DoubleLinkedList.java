
public class DoubleLinkedList {

    Node head;
    Node tail;
    int size;

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        private Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public DoubleLinkedList(){
        this.size = 0;
    }

    // insert element at start
    public void insertFirst(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = head;
            size++;
            return;
        }
        if (size == 1){
            head.prev = node;
            node.next = head;
            tail = head;
            head = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    // insert element at last
    public void insert(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public int deleteFirst(){
        if (size == 0){
            System.out.println("List is empty.");
            return -1;
        }
        if (size == 1){
            head = null;
            tail = null;
            size--;
        }
        int val = head.value;
        head.next.prev = null;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if (size == 0){
            System.out.println("List is empty.");
            return -1;
        }
        if (size == 1){
            int val = head.value;
            head = null;
            tail = null;
            size--;
            return val;
        }
        int val = tail.value;
        tail.prev.next = null;
        tail = tail.prev;
        size--;
        return val;
    }

    public int delete(int index){
        if (size == 0){
            System.out.print ("List is empty: ");
            return -1;
        }

        if (index > size-1){
            System.out.print("Error: index out of bound: ");
            return -1;
        }

        if (index == size - 1){
            return deleteLast();
        }

        if (index == 0){
            return deleteFirst();
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        int val = temp.next.value;
        temp.next = temp.next.next;
        temp.next.next.prev = temp;
        size--;
        return val;
    }

    public int search(int value){
        Node temp = head;
        int index = 0;
        while (temp != null){
            if (temp.value == value){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public void displayLast(){
        System.out.println("Last: " + tail.value);
    }

    public void displayFirst(){
        System.out.println("First: " + head.value);
    }

    public void displayList(){
        Node temp = head;
        System.out.print("List : null,");
        while (temp != null){
            System.out.print(temp.value + ",");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse(){
        Node temp = tail;
        System.out.print("Reverse List: null,");
        while(temp != null){
            System.out.print(temp.value + ",");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void size(){
        System.out.println("Size: " + size);
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.insert(7);
        list.insert(19);

        list.displayList();

        System.out.println(list.search(-1));


    }
}
