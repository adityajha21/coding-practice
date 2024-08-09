package org.example.linkedlist;

public class CustomLinkedList {

    //Every linkedlist contains head and tail
    private Node head;
    private Node tail;

    private int size;

    public CustomLinkedList(){
        this.size =0;
    }

    public void insertAtFirst(int value) {
            Node n = new Node(value);
            n.next = head;
            head = n;

            if(tail == null)
                tail = head;
            size+=1;
    }

    public void insertAtAnyPosition(int index, int value) throws InvalidIndex {
            if(index == 0) {
                insertAtFirst(value);
                return;
            }
            if(index == size) {
                insertAtLast(value);
                return;
            }
            if(index > size || index <0) {
                throw new InvalidIndex("Index is invalid");
            }

            Node temp = head;
            for (int i = 1; i <index ; i++) {
              temp = temp.next;
        }
       Node node = new Node(value, temp.next);
            temp.next = node;
            size+=1;

    }
    public void insertAtLast(int value) {
        if(tail == null){
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size+=1;
    }

    public int deleteFirst(){
        // remove head
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public void deleteLast() {
        Node temp = head;
      while(temp.next.next == null) {
          temp = temp.next;
      }
     temp = temp.next;
    }

    public void display(){
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
       private int value;
       private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
