/*class NumArray {
    //T(n): O(2n)
    int[] nums;
    int sum = 0;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}*/
class NumArray {
    //T(n): O(n)
    //Prefix sum approach
    int[] nums;
    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) {
            return nums[right];
        }
        return nums[right] - nums[left - 1];
    }
}
