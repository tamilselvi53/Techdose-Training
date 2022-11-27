class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        noOfNodes(root, Integer.MIN_VALUE);
        return count;
    }
    public void noOfNodes(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max) count++;
        int maxi = Math.max(max, root.val);
        noOfNodes(root.left, maxi);
        noOfNodes(root.right, maxi);
    } 
}
