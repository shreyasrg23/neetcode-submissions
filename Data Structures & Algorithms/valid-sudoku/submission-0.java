class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Integer>> row = new HashMap<>();
        Map<Integer, Set<Integer>> column = new HashMap<>();
        Map<Integer, Set<Integer>> squares = new HashMap<>();
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                int value = Character.getNumericValue(board[i][j]);
                int square = (i/3) * 3 + (j/3);
                if (!row.containsKey(i)) {
                    row.put(i, new HashSet<Integer>());
                }
                if (!column.containsKey(j)) {
                    column.put(j, new HashSet<Integer>());
                }
                if (!squares.containsKey(square)) {
                    squares.put(square, new HashSet<Integer>());
                }
                if (board[i][j] != '.')
                {
                    if (row.get(i).add(value) == false || column.get(j).add(value) == false || squares.get(square).add(value) == false)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
