class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        TreeNode root = buildTree(words);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs (board, i, j, root, res);
            }
        }   
        return res;
    }
    
    public TreeNode buildTree(String[] words) {
        TreeNode root = new TreeNode();
        for (String word: words) {
            TreeNode p = root;
            for (char c: word.toCharArray()) {
                int i = c - 'a';
                if (p.next[i] == null) p.next[i] = new TreeNode();
                p = p.next[i];
            }
            p.word = word;
        }
        return root;
    }
    public void dfs(char[][] board, int i, int j, TreeNode p, List<String> res) {
        char c = board[i][j];
        if (c == '#' || p.next[c - 'a'] == null) return;
        p = p.next[c - 'a'];
        if (p.word != null) {   // found one
            res.add(p.word);
            p.word = null;     // de-duplicate
        }

        board[i][j] = '#';
        if (i > 0) dfs(board, i - 1, j ,p, res); 
        if (j > 0) dfs(board, i, j - 1, p, res);
        if (i < board.length - 1) dfs(board, i + 1, j, p, res); 
        if (j < board[0].length - 1) dfs(board, i, j + 1, p, res); 
        board[i][j] = c;
    }   
}
    
class TreeNode {
    String word;
    TreeNode[] next;
    TreeNode() {
        next = new TreeNode[26];
        word = null;
    }
}
