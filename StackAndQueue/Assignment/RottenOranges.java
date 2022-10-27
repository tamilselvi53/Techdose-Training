class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    //T(n): O(m * n);
    //BFS traversal
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int total = 0, rotten = 0;
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 || grid[i][j] == 2) {
                    total++;
                }
                if (grid[i][j] == 2) {
                    rotten++;
                    q.add(new Pair(i, j));
                }
            }
        }
        if (total == rotten) return 0;
        int[] x = {0, 0, 1, -1};
        int[] y = {1, -1, 0, 0};
        int mins = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int dx = q.peek().first;
                int dy = q.peek().second;
                q.poll();
                for (int j = 0; j < x.length; j++) {
                    int row = dx + x[j];
                    int col = dy + y[j];
                    if (row >= 0 && row < m && col >= 0 && col < n) {
                        if (grid[row][col] == 1) {
                            grid[row][col] = 2;
                            q.add(new Pair(row, col));
                            rotten++;
                        }
                    }
                }
            }
            mins++;
            if (rotten == total) return mins;
        }
        return -1;
    }
}
