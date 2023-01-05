class Solution {
    public boolean cycleFound(ArrayList<ArrayList<Integer>> graph, int[] color, int node) {
        for (int adj: graph.get(node)) {
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
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            g.add(i, new ArrayList<>());
        }
        for (int[] arr: dislikes) {
            g.get(arr[0]).add(arr[1]);
            g.get(arr[1]).add(arr[0]);
        }
        int[] color = new int[n + 1];
        Arrays.fill(color, -1);
        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                color[i] = 1;
                if (cycleFound(g, color, i)) return false; //odd cycle found
            }
        }
        return true;
    }
}
