class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                provinces++;
                visited[i] = true;
                queue.offer(i);
                while (!queue.isEmpty()) {
                    int v = queue.poll();
                    for (int w = 0; w < n; w++) {
                        if (isConnected[v][w] == 1 && !visited[w]) {
                            visited[w] = true;
                            queue.offer(w);
                        }
                    }
                }
            }
        }
        return provinces;
    }
}
