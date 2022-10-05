class Solution {
    public int maxSubArray(int[] nums) {
        //T(n): O(n)
        //Kadane's algorithm
        int currSum = 0, maxi = Integer.MIN_VALUE;
        for (int val: nums) {
            currSum += val;
            if (currSum > maxi) {
                maxi = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxi;
    }
}
