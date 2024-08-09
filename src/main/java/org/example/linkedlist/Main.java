package org.example.linkedlist;

public class Main {
    public static void main(String[] args) throws InvalidIndex {
        CustomLinkedList cLL = new CustomLinkedList();
        cLL.insertAtFirst(5);
        cLL.insertAtFirst(10);
        cLL.insertAtFirst(51);
        cLL.insertAtFirst(25);
        cLL.insertAtFirst(20);
        cLL.insertAtLast(100);
        cLL.insertAtFirst(200);
        cLL.insertAtAnyPosition(3,14);
        cLL.display();
        cLL.deleteLast();
      //  System.out.println(cLL.deleteFirst());
     //   System.out.println(cLL.deleteLast());
        cLL.display();
    }
}
