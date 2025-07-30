//https://leetcode.com/problems/valid-sudoku/
//Time Complexity: O(1)
//Space Complexity: O(1)


class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] column = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];
        for(int i = 0; i < n; i++){
            row[i] = new HashSet<Character>();
            column[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                char val = board[i][j];
                if(val == '.') continue;
                if(row[i].contains(val)) return false;
                row[i].add(val);
                if(column[j].contains(val)) return false;
                column[j].add(val);
                int position = (i/3) * 3 + (j/3);
                if(box[position].contains(val)) return false;
                box[position].add(val);
            }
        }
        return true;
    }
}
