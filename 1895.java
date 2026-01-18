class Solution {
    public int largestMagicSquare(int[][] grid){
        int m=grid.length, n = grid[0].length;
        int[][] row=new int[m + 1][n + 1];
        int[][] column=new int[m + 1][n + 1];
        int[][] diagonal1 = new int[m + 1][n + 1]; 
        int[][] diagonal2 = new int[m + 1][n + 2]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i + 1][j + 1] = row[i + 1][j] + grid[i][j];
                column[i + 1][j + 1] = column[i][j + 1] + grid[i][j];
                diagonal1[i + 1][j + 1] = diagonal1[i][j] + grid[i][j];
                diagonal2[i + 1][j] = diagonal2[i][j + 1] + grid[i][j];
            }
        }
        int maxSize = Math.min(m, n);
        for (int size = maxSize; size >= 2; size--) {
            for (int i = 0; i + size <= m; i++) {
                for (int j = 0; j + size <= n; j++) {
                    if (isMagic(i, j, size, row, column, diagonal1, diagonal2)) {
                        return size;
                    }
                }
            }
        }
        return 1;
    }
    private boolean isMagic(int r, int c, int size,
                            int[][] row, int[][] column,
                            int[][] diagonal1, int[][] diagonal2) {
        int target = row[r + 1][c + size] - row[r + 1][c];
        for (int i = 0; i < size; i++) {
            int sum = row[r + i + 1][c + size] - row[r + i + 1][c];
            if (sum != target) return false;
        }
        for (int j = 0; j < size; j++) {
            int sum = column[r + size][c + j + 1] - column[r][c + j + 1];
            if (sum != target) return false;
        }
        int d1 = diagonal1[r + size][c + size] - diagonal1[r][c];
        int d2 = diagonal2[r + size][c] - diagonal2[r][c + size];
        return d1 == target && d2 == target;
    }
}
