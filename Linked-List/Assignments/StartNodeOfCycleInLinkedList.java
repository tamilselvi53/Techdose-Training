public class Solution {
    public ListNode detectCycle(ListNode head) {
        //T(n): O(n)
        //S(n): O(1)
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        //dist from 0 to startOfCycle = dist from intersection point to startOfcycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (entry != slow) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}
