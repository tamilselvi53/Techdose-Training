class Solution {
        public TreeNode invertTree(TreeNode root) {
        
        if (root == null) {
            return null;
        }
        /*
        TreeNode left = root.left,
                right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);*/
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
