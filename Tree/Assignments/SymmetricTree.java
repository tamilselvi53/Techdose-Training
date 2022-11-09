class Solution {
    // T(n): O(n)
    // S(n): O(n)
    public boolean mirror(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return root1 == root2;
        }
        return root1.val == root2.val && mirror(root1.left, root2.right) && mirror(root1.right, root2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return mirror(root.left, root.right);
    }
}
