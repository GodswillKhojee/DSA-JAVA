// Last updated: 12/10/2026, 16:27:09

class Solution {
    public boolean isValid(List<String> board, int row, int col) {
        // Check vertically upward
        for (int i = row - 1; i >= 0; i--) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }

        // Check upper-right diagonal
        int n = board.size();
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }

        return true;
    }

    public void chess(int row, int n,
                      List<List<String>> ans,
                      List<String> board) {
        if (row >= n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                char[] chars = board.get(row).toCharArray();
                chars[col] = 'Q';
                board.set(row, new String(chars));

                chess(row + 1, n, ans, board);

                chars[col] = '.';
                board.set(row, new String(chars));
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();

        String s = ".".repeat(n);
        for (int i = 0; i < n; i++)
            board.add(s);

        chess(0, n, ans, board);
        return ans;
    }
}
