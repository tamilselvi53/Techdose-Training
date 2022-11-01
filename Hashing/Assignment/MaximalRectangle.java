class Solution {
    public int largestRectangleInHistogram(int[] h) {
        int n = h.length;
        Stack<Integer> s = new Stack<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && h[s.peek()] > h[i]) {
                max = Math.max(max, h[s.pop()] * (i - (s.isEmpty() ? 0: s.peek() + 1)));
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
                max = Math.max(max, h[s.pop()] * (n - (s.isEmpty() ? 0: s.peek() + 1)));
            }
        return max;
    }
    public void setHeight(char[][] matrix, int[] heights, int i, int n) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == '1') {
                heights[j] += 1;
            } else {
                heights[j] = 0;
            }
            //System.out.println(heights[i]);
        }
    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == '1') {
                heights[i] = 1;
            }
        }
        int result = largestRectangleInHistogram(heights);
        for (int i = 1; i < m; i++) {
            setHeight(matrix, heights, i, n);
            int curr = largestRectangleInHistogram(heights);
            result = Math.max(result, curr);
        }
        return result;
    }
}
