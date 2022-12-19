class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // T(n): O(n) S(n): O(1)
        // DFS - postorder
        // Node found, then return node
        if (root == null || root == p || root == q) {
            return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // node not present at left
        if (left == null) {
            return right;
        } else if (right == null) { // node is not present at right
            return left;
        } else { // ancesstor found
            return root;
        }
    }
}
