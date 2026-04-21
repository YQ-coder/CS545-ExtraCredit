class Solution {
    public int numIslands(char[][] grid) {
         if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    grid[i][j] = '0';
                    
                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int currentRow = current[0];
                        int currentCol = current[1];
                        
                        for (int[] dir : directions) {
                            int neighborRow = currentRow + dir[0];
                            int neighborCol = currentCol + dir[1];
                            
                            if (neighborRow >= 0 && neighborRow < rows 
                                && neighborCol >= 0 && neighborCol < cols 
                                && grid[neighborRow][neighborCol] == '1') {
                                grid[neighborRow][neighborCol] = '0';
                                queue.offer(new int[]{neighborRow, neighborCol});
                            }
                        }
                    }
                }
            }
        }       
        return count;
    }
}
