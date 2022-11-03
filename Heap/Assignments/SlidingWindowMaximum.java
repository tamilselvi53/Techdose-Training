class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int index = 0;
        Deque<Integer> dequeue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            //To remove out of range elements
            while (!dequeue.isEmpty() && dequeue.peek() < (i - k + 1)) {
                dequeue.poll();
            }
            //To remove useless elements, doesn't contribute to max
            while (!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i]) {
                dequeue.pollLast();
            }
            dequeue.offer(i);
            //Store array
            if (i >= k - 1) {
                ans[index++] = nums[dequeue.peek()];
            }
        }
        
        return ans;
    }
}
