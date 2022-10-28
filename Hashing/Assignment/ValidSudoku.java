class Solution {
    //T(n): O(n * n)
    //S(n): O(n * n)
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.') {
                    String r = board[i][j] + "-c-" + i;
                    String c = board[i][j] + "-r-" + j;
                    String g = board[i][j] + "-g-" + (i / 3) + "-" +(j / 3);
                    if (set.contains(r) || set.contains(c) || set.contains(g)) {
                        return false;
                    }
                    set.add(r);
                    set.add(c);
                    set.add(g);
                }
            }
        }
        return true;
    }
}