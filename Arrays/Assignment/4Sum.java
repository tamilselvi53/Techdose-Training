class Solution {
    //T(n): O(n^3)
    //S(n): O(n)
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ll = new ArrayList <List<Integer> >();
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int x = j + 1, y = n - 1;
                long sum = (long)target - (long)nums[i] - (long)nums[j];
                while (x < y) {
                    if ((nums[x] + nums[y]) == sum){
                        List<Integer> lst = new ArrayList<>();
                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[x]);
                        lst.add(nums[y]);
                        set.add(lst);
                        x++;
                        y--;
                    } else if ((nums[x]+nums[y]) > sum) {
                        y--;
                    } else {
                        x++;
                    }
                }
                
            }
        }
        for (List<Integer> lst: set) {
            ll.add(lst);
        }
        return ll;
    }
}
