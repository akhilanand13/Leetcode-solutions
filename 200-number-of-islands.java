//https://leetcode.com/problems/number-of-islands/
//Time Complexity: O(m * n)
//Space Complexity: O(m * n)
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length, cols = grid[0].length, islandCount = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') { 
                    dfs(grid, r, c); 
                    islandCount++;    
                }
            }
        }
        return islandCount;
    }
    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') 
            return; 
        grid[r][c] = '0'; 
        dfs(grid, r + 1, c); 
        dfs(grid, r - 1, c); 
        dfs(grid, r, c + 1); 
        dfs(grid, r, c - 1); 
    }
}
