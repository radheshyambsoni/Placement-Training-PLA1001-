public class Jun02_DLL {
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Initially, heade and tail is set to null
    Node head, tail = null;

    // add a node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // if list is empty, head and tail points to newNode
        if (head == null) {
            head = tail = newNode;
            // head's prev will be null
            head.prev = null;
            // tail's next will be null
            tail.next = null;
        } else {
            // add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            // newNode->prev set to tail
            newNode.prev = tail;
            // newNode becomes new tail
            tail = newNode;
            // tail's next point to null
            tail.next = null;
        }
    }

    // Sort biotonic linked list element
    public void sortBiotonicList() {
        if (this.head != null) {
            Node front = this.head, last = null;
            if (tail.data < front.data) {
                // When need to change head and tail node
                this.head = this.tail;
                this.tail = tail.prev;
                this.tail.next = null;
                this.head.prev = null;
                this.head.next = front;
                front.prev = this.head;
            }
            while (front != null && tail != null && front != tail) {
                if (this.tail.data < front.data) {
                    // When need to move last node to
                    // beginning of front node.
                    // Get last node
                    last = this.tail;
                    // Set new last node
                    this.tail = this.tail.prev;
                    this.tail.next = last.next;
                    if (last.next != null) {
                        last.next.prev = this.tail;
                    }
                    last.prev = front.prev;
                    if (front.prev != null) {
                        front.prev.next = last;
                    }
                    last.next = front;
                    front.prev = last;
                } else {
                    // Visit to next node
                    front = front.next;
                }
            }
        } else {
            System.out.println("Empty linked list");
        }
    }

    // print all the nodes of doubly linked list
    public void printDLL() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            // Print each node and then go to next.
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        // create a DoublyLinkedList object
        Jun02_DLL dll1 = new Jun02_DLL();
        // Add nodes to the list
        dll1.addNode(10);
        dll1.addNode(20);
        dll1.addNode(30);
        dll1.addNode(20);
        dll1.addNode(10);

        // print the nodes of DoublyLinkedList
        dll1.printDLL();

        dll1.sortBiotonicList();
        System.out.println("sorted\n");
        dll1.printDLL();
    }
}