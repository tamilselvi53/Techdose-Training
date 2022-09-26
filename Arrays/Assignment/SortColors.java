class Solution {
    //T(n): O(n)
    //S(n): O(1)
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, h = n - 1;
        int i = 0;
        //Two-pointer approach
        while (i <= h) {
            if (nums[i] == 0) {
                swap(nums, i, l);
                l++;
                //Swaped number will be 1 only
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, h);
                h--;
                //Not moving to next index, reason is nums[i] may be 2, 1, 0
                //By this process, I can move all 2's to right-side
            } else {
                i++;
            }
        }
    }
}
