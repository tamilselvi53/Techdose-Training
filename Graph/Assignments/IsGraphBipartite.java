class Solution {
    public boolean cycleFound(int[][] graph, int[] color, int node) {
        for (int adj: graph[node]) {
            if (color[adj] == -1) { //unvisited
                color[adj] = 1 - color[node];
                if (cycleFound(graph, color, adj)) {
                    return true;
                }
            } else if (color[node] == color[adj]) {
                return true;
            }
        }
        return false;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                color[i] = 1;
                if (cycleFound(graph, color, i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
