class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //T(n): O(max(len1, len2))
        //S(n): O(1)
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            int val = sum % 10;
            ListNode node = new ListNode(val);
            carry = sum / 10;
            head.next = node;
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + carry;
            ListNode node = new ListNode(sum % 10);
            head.next = node;
            carry = sum / 10;
            head = head.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val + carry;
            ListNode node = new ListNode(sum % 10);
            head.next = node;
            carry = sum / 10;
            head = head.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            ListNode node = new ListNode(carry);
            head.next = node;
        }
        return dummy.next;
    }
}
