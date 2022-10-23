class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //T(n): 0(n);
        //S(n): 0(n);
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.empty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            if (stack.empty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
