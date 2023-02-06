class GfG
{     
    //T(n): O(no.of nodes) --> traversing all nodes using pointers
    //S(n): O(1)
  //Merge 2 list based on its bottom pointers & return merged list
    Node merge(Node n1, Node n2) {
        Node head = new Node(-1);
        Node temp = head;
        while (n1 != null && n2 != null) {
            if (n1.data < n2.data) {
                temp.bottom = n1;
                n1 = n1.bottom;
            } else {
                temp.bottom = n2;
                n2 = n2.bottom;
            }
            temp = temp.bottom;
        }
        
        while (n1 != null) {
            temp.bottom = n1;
            temp = temp.bottom;
            n1 = n1.bottom;
        }
        while (n2 != null) {
            temp.bottom = n2;
            temp = temp.bottom;
            n2 = n2.bottom;
        }
        return head.bottom;
    }
    Node flatten(Node root)
    {
	// Your code here
	    //Base case to reach last node
	    if (root.next == null) {
	        return root;
	    }
	    //Merging from last node to first
	    Node next = flatten(root.next);
	    
	    //Similar to merging 2 linked list 
	    return merge(root, next);
    }
}
