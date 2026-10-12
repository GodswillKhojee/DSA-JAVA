// Last updated: 13/10/2026, 02:44:01
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < board.length;row++)
        {
            HashSet<Character> set1 = new HashSet<>();
            for(int col = 0; col<board.length;col++)
            {
                if(board[row][col] == '.') continue;
                if(set1.contains(board[row][col])) return false;
                set1.add(board[row][col]);
            }
        }

        for(int col = 0; col< board.length;col++)
        {
            HashSet<Character> set2 = new HashSet<>();
            for(int row = 0; row<board.length;row++)
            {
                if(board[row][col] == '.') continue;
                if(set2.contains(board[row][col])) return false;
                set2.add(board[row][col]);
            }
        }
        // box check
        for(int boxr = 0; boxr < board.length;boxr+=3)
        {
            for(int boxc = 0; boxc < board.length;boxc+=3)
            {
                HashSet<Character> set3 = new HashSet<>();

                for(int i = boxr;i < boxr+3;i++)
                {
                    for(int j = boxc; j < boxc+3;j++)
                    {
                        if(board[i][j] == '.') continue;
                        if(set3.contains(board[i][j])) return false;
                        set3.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}