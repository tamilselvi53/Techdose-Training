class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        int[] count = new int[1];
        dfs(board, count, 0);
        return count[0];
    }
    public void dfs(char[][] board, int[] count, int colIndex) {
        if (colIndex == board.length) {
            count[0]++;
            return;
        }
        
        for (int i = 0; i < board.length; i++) {
            if (valid(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, count, colIndex + 1);
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
}
