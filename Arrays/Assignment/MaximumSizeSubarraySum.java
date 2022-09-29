class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //T(n): O(n)
        //S(n): O(1)
        int i = 0;
        int minLen = Integer.MAX_VALUE, sum = 0;
        //Two-pointer approach
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >=  target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            minLen = 0;
        }
        return minLen;
    }
}
