class Solution {
    //Reverse from ptr1 + 1 to n to get lowest sequence
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++; end--;
        }
    }
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length, ptr = -1;
        //find first decreasing index from the last
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                ptr = i-1;
                break;
            }
        }
        if (ptr == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int min = ptr + 1;
        int found = 0; //to check minimum found or not
        //ptr should be swapped with next greater element
        for (int i = ptr + 1; i < n; i++) {
            if (nums[i] > nums[ptr] && nums[i] <= nums[min]) {
                min = i;
                found = 1;
            }
        }
        if (found == 1) {
            swap(nums, ptr, min);
            reverse(nums, ptr + 1, n - 1);
        }
    }
}
