// Last updated: 14/10/2026, 15:20:54
class Solution {
    public boolean isValid(char[][] board, int i, int j, char d) {

        for (int k = 0; k < 9; k++) {
            // Check row
            if (board[i][k] == d)
                return false;

            // Check column
            if (board[k][j] == d)
                return false;
        }

        // Find starting position of the 3x3 box
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;

        for (int a = startRow; a < startRow + 3; a++) {
            for (int b = startCol; b < startCol + 3; b++) {
                if (board[a][b] == d)
                    return false;
            }
        }

        return true;
    }

    public boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    for (char d = '1'; d <= '9'; d++) {
                        if (isValid(board, i, j, d)) {
                            board[i][j] = d;
                            if (solve(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}