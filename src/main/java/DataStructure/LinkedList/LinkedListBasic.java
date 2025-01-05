package DataStructure.LinkedList;



public class LinkedListBasic {
    private int value;
    private Node next;
    private Node head;
    private Node tail; // what is the benefit of taking tail, which is extra node? -> because suppose i need to insert node at last, then when i need to traverse till end
    //but by using maintaining tail, we can directly insert node at last of the linkedlist
    private int size ;

    public LinkedListBasic() {
        this.size = 0;
    }

    public void search(int num) {
        Node temp = head;
        while(temp != null) {
            if (temp.value == num) {
                System.out.println("Number is found " );
                break;
            }
            temp = temp.next;
        }

    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int value){
        // using tail
        /*Node node = new Node(value);
            tail.next = node;
            tail = head;*/
        // without tail use
        Node node = new Node(value);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    // calculate index for value 1
    public int findIndex(int data) {
        int index = 0;
        Node temp = head;
        while(temp.value != data) {
            temp = temp.next;
            index++;
        }
        return index;
    }

    public void insertAtIndex(int index, int value){
        if(index == 0) {
            insertAtFirst(value);
            return;
        }
        if(index == size) {
            insertAtLast(value);
            return;
        }

        Node temp = head;
        Node node = new Node(value);
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        // Re-link nodes to insert the new node
        node.next = temp.next; // Point new node to the next node
        temp.next = node;      // Point previous node to the new node

        size++;
    }

    // insert in the middle
    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;

    }

    public int deleteLast(){
        int value = tail.value;
        tail = tail.next;
        if(tail == null) {
            head = null;
        }
        size--;
        return value;
    }

    // delete by value
    //search a value in linkedlist

    public void display(){
        Node temp = head;
        while(temp !=null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseLinkedList() {
        System.out.println("Reverse a Linked List");
        if(head == null && head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null) {
            Node nextNode = currentNode.next;  // hold the address of current Next node
            currentNode.next = prevNode;  // it linked to previous node

            //update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
}
