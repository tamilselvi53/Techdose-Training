class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //T(n): O(n)
        //S(n): O(1)
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
