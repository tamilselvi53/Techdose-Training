class Solution {
    //T(n): O(n)
    //S(n): 0(1)
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        max = root.val;
        int ans = ways(root);
        return max;
    }
    public int ways(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // To ignore negative sum, compared with 0
        int left = Math.max(0, ways(root.left)); 
        int right = Math.max(0, ways(root.right));
        //Curved path sum
        max = Math.max(root.val + left + right, max);
        //for each node, it's value, anyone left or right, not to form a curve
        return root.val + Math.max(left, right);
    }
}
