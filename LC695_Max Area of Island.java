class Solution {
        private int m, n;
        private int[][] grid;
        private boolean[][] visited;
        private int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        public int maxAreaOfIsland(int[][] grid) {
            this.m = grid.length;
            this.n = grid[0].length;
            this.grid = grid;
            this.visited = new boolean[m][n];
            int maxArea = 0;
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        maxArea = Math.max(maxArea, dfs(i, j));
                    }
                }
            }
            return maxArea;
            }
            private int dfs(int i, int j) {
                if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0 || visited[i][j]) {
                    return 0;
                }
                visited[i][j] = true;
                int area = 1;
                for (int[] d: dirs) {
                    area += dfs(i + d[0], j + d[1]);
                }
                return area;
            }
}
