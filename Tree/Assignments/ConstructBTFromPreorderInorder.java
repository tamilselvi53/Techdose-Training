 class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = constructTree(0, 0, inorder.length - 1, preorder, inorder);
        return root;
    }
    public TreeNode constructTree(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inMid = map.get(preorder[preStart]);
        //System.out.print(inMid + " ");
        root.left = constructTree(preStart + 1, inStart, inMid - 1, preorder, inorder);
        root.right = constructTree(preStart + inMid - inStart + 1, inMid + 1, inEnd, preorder, inorder);
        return root;
    }
}
