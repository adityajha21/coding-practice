package DataStructure.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeLinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify merging
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append remaining nodes from either list
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next; // Return the merged list (skipping dummy)
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create two linked lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        System.out.println("List 1:");
        printList(l1);

        System.out.println("List 2:");
        printList(l2);

        ListNode mergedList = mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        printList(mergedList);
    }
}
