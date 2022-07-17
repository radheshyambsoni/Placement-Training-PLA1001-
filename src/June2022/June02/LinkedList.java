package June2022.June02;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            // Else traverse till the last node
            // and insert the newNode there
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the newNode at last node
            last.next = newNode;
        }
    }

    // Loop detection
    public boolean detectCycle(Node head) {
        // take two references – 'slow' and 'fast'
        Node slow = this.head, fast = this.head;

        while (fast != null && fast.next != null) {
            // move slow by one
            slow = slow.next;

            // move fast by two
            fast = fast.next.next;

            // if they meet any node, the linked list contains a cycle
            if (slow == fast) {
                return true;
            }
        }

        // we reach here if slow and fast do not meet
        return false;
    }

    public void printList() {
        Node currNode = this.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
    }
}
