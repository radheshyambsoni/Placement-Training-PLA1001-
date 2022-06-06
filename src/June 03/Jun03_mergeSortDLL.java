// Java program to implement merge sort in singly linked list

public class Jun03_mergeSortDLL {
    // Initially, heade and tail is set to null
    Node head, tail=null;
    
    static class Node {
        int data;
        Node prev,next;

        public Node(int data) {
            this.data = data;
        }
    }

    // add a head to the list
    public void addNode(int data) {
        // Create a new head
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

	void print() {
		Node temp=this.head;
		System.out.println("Forward Traversal using next pointer");
		while(temp!= null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println("\nBackward Traversal using prev pointer");
		temp=this.tail;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
	}

	void mergeSort(Node node){
		Node slow=node;
		Node fast=node;
		while(fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		slow.prev.next=null;
		slow.prev=null;
		mergeSort(node);
		mergeSort(slow);

		merge(node,slow);
	}

	void merge(Node first, Node second) {
		
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		Jun03_mergeSortDLL l1=new Jun03_mergeSortDLL();
        l1.addNode(5);
        l1.addNode(7);
        l1.addNode(10);
        l1.addNode(2);
        l1.addNode(4);
        l1.addNode(15);
        l1.addNode(6);

        l1.print();
	}
}