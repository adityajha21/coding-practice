package DataStructure.LinkedList;

public class MainLinkedListBasic {
    public static void main(String[] args) {
        LinkedListBasic linkedListBasic = new LinkedListBasic();
        linkedListBasic.insertAtFirst(10);
        linkedListBasic.insertAtFirst(1);
        linkedListBasic.insertAtFirst(40);
        linkedListBasic.insertAtFirst(6);
        linkedListBasic.insertAtFirst(9);
        linkedListBasic.insertAtLast(15);
        linkedListBasic.insertAtIndex(2,77);
        int deleteFirstValue =   linkedListBasic.deleteFirst();
        System.out.println("First Node : " +deleteFirstValue +" is deleted") ;

        int deleteLastValue =   linkedListBasic.deleteLast();
        System.out.println("Last Node : " +deleteLastValue +" is deleted") ;

        linkedListBasic.display();
        linkedListBasic.reverseLinkedList();
        linkedListBasic.display();
        linkedListBasic.search(1);

     /*   int index =  linkedListBasic.findIndex(15);
        System.out.println("Data 40 is present in " +index);*/

    }
}
