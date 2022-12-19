class Solution {
    public boolean isValidBST(TreeNode root) {
        return BST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean BST(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }
        if ((root.val <= minValue) || (root.val >= maxValue)) {
            return false;
        }
        boolean left = BST(root.left, minValue, root.val);
        boolean right = BST(root.right, root.val, maxValue);
        return (left && right);
    }
}
