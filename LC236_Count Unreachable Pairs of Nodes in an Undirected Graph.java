class Solution {
    int[] parent;
    int[] size;
        public long countPairs(int n, int[][] edges) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for (int[] edge: edges) {
            union(edge[0], edge[1]);
        }

        long ans = 0;
        long remain = n;
        
        for (int i = 0; i < n; i++) {
            if(parent[i] == i) {
                remain = remain - size[i];
                ans = ans + size[i] * remain;
            }
        }
        return ans;
    }
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    private void union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if (rx == ry) return;

        if (size[rx] < size[ry]) {
            parent[rx] = ry;
            size[ry] += size[rx];
        } else {
            parent[ry] = rx;
            size[rx] += size[ry];
        }
    }
}
