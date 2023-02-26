Question Link: https://practice.geeksforgeeks.org/problems/1a4b617b70f0142a5c2b454e6fbe1b9a69ce7861/1



class Solution {
    static int vertices;
    static int edges;
    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean v[] = new boolean[V + 1];
        int ans = 0;
        for (int i = 1; i <= V; i++) {
            if (!v[i]) {
                vertices = 0;
                edges = 0;
                dfs(adj, i, v);
                edges /= 2;
                if (edges == ((long)vertices * (vertices - 1)) / 2) ans++;
            }
        }
        return ans;
    }
    private static void dfs(ArrayList<ArrayList<Integer>> A, int i, boolean v[]) {
        v[i] = true;
        vertices++;
        edges += A.get(i).size();
        for (int child : A.get(i)) {
            if (!v[child]) {
                dfs(A, child, v);
            }
        }
    }
}
