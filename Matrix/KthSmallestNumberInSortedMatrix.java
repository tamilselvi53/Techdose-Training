class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //T(n): n * n log (max - min) dbt
        int m = matrix.length, n = matrix[0].length;
        int l = matrix[0][0], h = matrix[m - 1][n - 1], mid, capacity;
        while (l < h) {
            mid = l + (h - l) / 2;
            capacity = lessEqual(mid, m, n, matrix);
            if (capacity >= k) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;   
    }
    public int lessEqual(int mid, int m, int n, int[][] matrix) {
        int count = 0;
        int i = m - 1, j =0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > mid) {
                i--;
            } else {
                count += i + 1;
                j++;
            }
        }
        return count;
    }
}
