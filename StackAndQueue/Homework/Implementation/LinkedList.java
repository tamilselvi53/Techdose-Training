class LinkedList {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head, top;
    LinkedList() {
        head = null;
        top = head;
    }
    public void insertAtBeginning(int val) {
	    Node new_node = new Node(val);
	    new_node.next = head;
	    head = new_node;
	    top = head;
	}
	public int getData(Node node) {
	    return node.val;
	}
	public void insertAtEnd(int val) {
		if (head == null) {
			head = new Node(val);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(val);
		}
	}
	public void deleteAtBeginning() {
	    Node temp = head.next;
	    head = temp;
	    top = temp;
	}
	public void deleteAtEnd() {
	    Node temp = head;
	    while (temp.next.next != null) {
	        temp = temp.next;
	    }
	    temp.next = null;
	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
