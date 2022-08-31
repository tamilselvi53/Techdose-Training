class Solution {
    //T(n) : O(n)
    //S(n) : O(1)
   public int majorityElement(int[] nums) {
        int count = 0;
        int val = nums[0];
        // expected num count should be greater than other numbers count.
        for (int num : nums) {
            if (count == 0) {
                val = num;
            }
            count += (num == val) ? 1 : -1;
        }

        return val;
    }
}
