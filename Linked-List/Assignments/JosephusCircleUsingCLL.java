public class CircularLinkedList {
	class Node {
		public int val;
		public Node next;
		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	private Node head;
	private Node last;
	CircularLinkedList() {
		head = null;
		last = null;
	}
  //T(n): O(1)
	public void insertAtBeginning(int val) {
	    Node new_node = new Node(val);
	    new_node.next = head;
	    head = new_node;
	}
  //T(n): O(1)
	public void insertAtEnd(int val) {
		if (head == null) {
			head = new Node(val);
			last = head;
		} else {
		    Node node = new Node(val);
		    last.next = node;
		    last = node;
		}
		last.next = head;
	}
  //T(n): O(1)
	public void deleteAtBeginning() {
	    head = head.next;
	}
  //T(n): O(n)
	public void deleteAtEnd() {
	    Node temp = head;
	    while (temp.next.next != head) {
	        temp = temp.next;
	    }
	    last = temp;
	    temp.next = head;
	}
  //T(n): O(n)
	public void display() {
		Node temp = head;
		while (temp != last) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print(last.val);
		System.out.print(last.next.val);

	}
	//T(n): O(k * n)
	public int josephuscircle(int n, int k) {
        Node prev = head;
        Node curr = head;
        while (curr != curr.next) {
            int count = 1;
            while (count != k) {
                prev = curr;
                curr = curr.next;
                count++;
            }
            prev.next = curr.next;
            curr = prev.next;
        }
        return curr.val;
    }
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    CircularLinkedList LL = new CircularLinkedList();
	    for (int i = 1; i <= n; i++) {
	        LL.insertAtEnd(i);
	    }
	    int k = sc.nextInt();
	    System.out.println(LL.josephuscircle(n, k));
	    //LL.display();
	}
}
