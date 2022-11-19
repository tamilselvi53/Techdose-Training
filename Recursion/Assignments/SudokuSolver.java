class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
    public boolean solve(char[][] board, int i, int j) {
        if (i == 9 && j == 0) return true;
        if (board[i][j] != '.') return solve(board, j+1 == 9 ? i + 1 : i, j+1 == 9 ? 0 : j + 1);
        
        for (char c = '1'; c <= '9'; c++) {
            if (isValid(board, i, j, c)) {
                board[i][j] = c;
                if (solve(board, j+1 == 9 ? i + 1 : i , j+1 == 9 ? 0 : j + 1)) {
                    return true;
                }
                board[i][j] = '.';
            }
        }
        return false;
    }
    public boolean isValid(char[][] board, int row, int col, char c) {
        for(int i = 0; i < 9; i++) {
            if(board[i][col] != '.' && board[i][col] == c) return false; //check row
            if(board[row][i] != '.' && board[row][i] == c) return false; //check column
            if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' && 
board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }
}
