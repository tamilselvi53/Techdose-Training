class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //T(n): O(n*n)
        //S(n): O(n*n)
        Arrays.sort(nums);
        int n = nums.length;
        int j, k;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || i > 0 && (nums[i] != nums[i - 1])) {
                j = i + 1; k = n - 1;
                int sum = 0 - nums[i];
                while (j < k) {
                    List<Integer> temp = new ArrayList<>();
                    if (nums[j] + nums[k] == sum) {
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        res.add(temp);
                    
                        while (j < k && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        while (j < k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        j++; k--;
                    } else if (nums[j] + nums[k] < sum) {
                        j++;
                    } else {
                        k--;
                    }
                }
                
            } 
        }
        return res;
    }
}
