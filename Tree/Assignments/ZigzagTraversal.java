class Solution {
    public void reverse(List<Integer> al, int sz) {
        for (int i = 0; i < sz / 2; i++) {
            int val = al.get(i);
            al.set(i, al.get(sz - 1 - i)); 
            al.set(sz - 1 - i, val);
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer> >();
        if (root == null) {
            return ans;
        }
        q.add(root);
        boolean level = true;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                temp.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            if (level == false) {
                reverse(temp, size);
            }
            level = (!level);
            ans.add(temp);
        }
        return ans;
    }
}
