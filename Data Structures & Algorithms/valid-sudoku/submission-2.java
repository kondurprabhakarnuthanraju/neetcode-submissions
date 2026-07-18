class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows and columns
        for (int j = 0; j < 9; j++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();

            for (int i = 0; i < 9; i++) {

                if (board[j][i] != '.') {
                    if (row.contains(board[j][i])) {
                        return false;
                    }
                    row.add(board[j][i]);
                }

                if (board[i][j] != '.') {
                    if (col.contains(board[i][j])) {
                        return false;
                    }
                    col.add(board[i][j]);
                }
            }
        }

        // Check all 3x3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                Set<Character> st = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] != '.') {
                            if (st.contains(board[i][j])) {
                                return false;
                            }
                            st.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return true;
    }
}