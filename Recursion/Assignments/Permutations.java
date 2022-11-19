class Solution {
    public void backtrack(int[] nums, List<Integer> tempArr, List<List<Integer>> res) {
        if (tempArr.size() == nums.length) {
            res.add(new ArrayList<>(tempArr));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!tempArr.contains(nums[i])) {
                    tempArr.add(nums[i]);
                    backtrack(nums, tempArr, res);
                    tempArr.remove(tempArr.size() - 1);
                }
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }
}
