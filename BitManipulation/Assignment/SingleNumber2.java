class Solution {
    //T(n): O(n)
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 1; i <= 32; i++) {
            int count = 0;
            for (int val: nums) {
                //val = Math.abs(val);
                if (((val >> i) & 1) > 0) {
                    count++;
                }
            }
            if ((count % 3) != 0) {
                ans |= (1<<i); // In particular position, 1 will be set
            }
        }
        return ans;
    }
}
