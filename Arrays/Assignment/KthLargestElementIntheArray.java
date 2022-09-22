class Solution {
    //T(n): O(n*2)
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    //to find all elemnts pivot index
    public int partition(int[] nums, int k, int l, int h) {
        int pivot = h;
        int i = l - 1, j = l;
        for (; j < h; j++) {
            if (nums[j] >= nums[pivot]) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i+1, pivot);
        //if index of any element is k - 1, then return that
        if (i + 1 == k - 1) {
            return nums[i+1];
        } else if (i + 1 > k - 1) { //if idx > target, then search lefside 
            return partition(nums, k, l, i);
        }
        //if idx > target, then search rightside
        return partition(nums, k, i+2, h);
    }
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return partition(nums, k, 0, n-1);
    }
}
