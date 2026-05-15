class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Track seen digits for each row, column, and 3x3 box
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue; // skip empty cells

                int num = board[r][c] - '1'; // convert '1'-'9' to index 0-8
                int boxIndex = (r / 3) * 3 + (c / 3); // which of the 9 boxes

                // Check if this digit was already seen
                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Mark as seen
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}