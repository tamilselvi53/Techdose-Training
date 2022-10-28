public class LinkedList {
	class Node {
		public int val;
		public Node next;
		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	private Node head;
	LinkedList() {
		head = null;
	}
  //T(n): O(1)
	public void insertAtBeginning(int val) {
	    Node new_node = new Node(val);
	    new_node.next = head;
	    head = new_node;
	}
  //T(n): O(n)
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
  //T(n): O(1)
	public void deleteAtBeginning() {
	    head = head.next;
	}
  //T(n): O(n)
	public void deleteAtEnd() {
	    Node temp = head;
	    while (temp.next.next != null) {
	        temp = temp.next;
	    }
	    temp.next = null;
	}
  //T(n): O(n)
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

}
