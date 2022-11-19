class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<List<String> >();
        dfs(board, res, 0);
        return res;
    }
    public void dfs(char[][] board, List<List<String>> res, int colIndex) {
        if (colIndex == board.length) {
            res.add(construct(board));
            return;
        }
        
        for (int i = 0; i < board.length; i++) {
            if (valid(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, res, colIndex + 1);
                board[i][colIndex] = '.';
            }
        }
    }
    public boolean valid(char[][] board, int row, int col) {
        int down = col - 1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'Q' && (i + col == j + row || i + j == row + col || row == i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            ans.add(s);
        }
        return ans;
    }
}
