class Solution {
    public boolean dfs(char[][] board, int i, int j, int m, int n, String word, int w_len, int pos, boolean[][] vis) {
        //T(n): O(m * n * 3 w_len)
        if (w_len == pos) {
            return true;
        }
        if (i < 0 || i >= m || j < 0 || j >= n || vis[i][j] == true) {
            return false;
        }
        if (board[i][j] != word.charAt(pos)) {
            return false;
        }
        int[] x = {0, 0, 1, -1};
        int[] y = {1, -1, 0, 0};
        vis[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int r = i + x[k];
            int c = j + y[k];
            if (dfs(board, r, c, m, n, word, w_len, pos + 1, vis) == true) {
                return true;
            }
        }
        vis[i][j] = false;
        return false;
        
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int w_len = word.length();
        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char currChar = board[i][j];
                if (currChar == word.charAt(0)) {
                    if (dfs(board, i, j, m, n, word, w_len, 0, vis)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
