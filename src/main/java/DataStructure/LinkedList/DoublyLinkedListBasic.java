package DataStructure.LinkedList;

public class DoublyLinkedListBasic {
        private Node head;
        private Node prev;
        int size = 0;
        public DoublyLinkedListBasic() {
            size++;
        }
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
       if(head != null) {
           head.prev = newNode;
       }
       head = newNode;
       // System.out.println(head.data);
        size++;
    }

    public void display() {
            Node temp = head;
            Node last = null;

            while(temp != null) {
                System.out.print(temp.data +"->");
                last = temp;
                temp = temp.next;
            }
        System.out.println("END");

            while(last != null) {
                System.out.print(last.data +"->");
                last = last.prev;
            }
        System.out.println("START");
    }


}
