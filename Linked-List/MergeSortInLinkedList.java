class Solution
{
    //Function to sort the given linked list using Merge Sort.
    //T(n): O(n Logn)
    //S(n): O(n)
    static Node findMiddle(Node head) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node merge(Node a, Node b) {
        Node dummy = new Node(-1);
        Node result = dummy;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        while (a != null && b != null) {
            if (a.data <= b.data) {
                result.next = a;
                a = a.next;
                result = result.next;
            } else {
                result.next = b;
                b = b.next;
                result = result.next;
            }
        }
        if (a == null) {
            result.next = b;
        }
        if (b == null) {
            result.next = a;
        }
        return dummy.next;
    }
    static Node mergeSort(Node head)
    {
        // add your code here
        if (head == null || head.next == null) {
            return head;
        }
        
        Node middle = findMiddle(head);
        Node nextMiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nextMiddle);
        Node h = merge(left, right);
        return h;
    }
}
