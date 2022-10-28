class Solution {
    public boolean isPalindrome(ListNode head) {
        //T(n): O(n)
        //S(n): O(1)
        if (head == null || head.next == null) {
            return true;
        }
        // To find middle element
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse from middle element
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next = curr.next;
        while (curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
        // check for palindrome
        ListNode newHead = curr;
        while (head != null && newHead != null) {
            if (head.val != newHead.val) {
                //System.out.println(newHead.val);
                //System.out.println(head.val);
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
        
    }
}
