class Solution {
    public int largestRectangleArea(int[] h) {
        //T(n): O(n)
        int n = h.length;
        Stack<Integer> s = new Stack<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            while (!s.empty() && h[s.peek()] > h[i]) {
                max = Math.max(max, h[s.pop()] * (i - (s.isEmpty() ? 0: s.peek() + 1)));
            }
            s.push(i);
        }
        while (!s.empty()) {
                max = Math.max(max, h[s.pop()] * (n - (s.isEmpty() ? 0: s.peek() + 1)));
            }
        return max;
    }
}
