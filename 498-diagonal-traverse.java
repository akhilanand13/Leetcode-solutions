//https://leetcode.com/problems/diagonal-traverse/
//Time Complexity: O(m*n)
//Space Complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, dir = 1;
        int idx = 0;
        while (idx < m * n) {
            result[idx++] = mat[row][col];
            if (dir == 1) {
                if (col == n - 1) {
                    row++;
                    dir = -1;
                } else if (row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                    dir = 1;
                } else if (col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}