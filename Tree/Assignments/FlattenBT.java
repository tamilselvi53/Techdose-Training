class Solution {
    TreeNode head = null;
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        //flatten(root, head);
        if (root == null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
    public void flatten(TreeNode root, TreeNode prev) {
        if (root == null) {
            return;
        }
        head.right = root;
        head = head.right;
        flatten(root.left, head);
        flatten(root.right, head);
        /*
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root); // 1
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop(); // 1
            if (curr.right != null) {
                stack.push(curr.right); // 5
            }
            if (curr.left != null) {
                stack.push(curr.left); // 2
            }
            if (!stack.isEmpty()) {
                curr.right = stack.peek();
            }
            curr.left = null;
        }*/
    }
}
