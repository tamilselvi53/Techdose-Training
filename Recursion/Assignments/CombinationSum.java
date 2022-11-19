class Solution {
    public void backtrack(int[] nums, List<Integer> tempArr, List<List<Integer>> res, int sum, int target, int start) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(tempArr));
        } else {
            for (int i = start; i < nums.length; i++) {
                tempArr.add(nums[i]);
                sum += nums[i];
                backtrack(nums, tempArr, res, sum, target, i);
                sum -= tempArr.get(tempArr.size() - 1);
                tempArr.remove(tempArr.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res, 0, target, 0);
        return res;
    }
}
