class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        //T(n): O(n)
        //S(n): O(n)
        if (head == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.data);
        Node curr = head.next;
        Node prev = head;
        while (curr != null) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            set.add(curr.data);
            curr = curr.next;
        }
        return head;
    }
}
