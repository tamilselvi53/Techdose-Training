class Solution {
    List<TreeNode> al = new ArrayList<>();
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        al.add(root);
        inorder(root.right);
    }
    public TreeNode constructTree(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + ((end - start) / 2);
        TreeNode root = al.get(mid);
        root.left = constructTree(start, mid - 1);
        root.right = constructTree(mid + 1, end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        TreeNode new_root = constructTree(0, al.size() - 1);
        return new_root;
    }
}
