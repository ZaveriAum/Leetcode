import java.util.BitSet;

public class App {

    public static boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;
        BitSet boardBol = new BitSet(rows * cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boardBol.clear();
                if (dfs(board, boardBol, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, BitSet boardBol, int i, int j, String word, int wordI) {
        int rows = board.length, cols = board[0].length;

        if (wordI == word.length()) {
            return true;
        }

        if (i < 0 || i >= rows || j < 0 || j >= cols || boardBol.get(i * cols + j)
                || board[i][j] != word.charAt(wordI)) {
            return false;
        }

        boardBol.set(i * cols + j);

        boolean found = dfs(board, boardBol, i + 1, j, word, wordI + 1) ||
                dfs(board, boardBol, i - 1, j, word, wordI + 1) ||
                dfs(board, boardBol, i, j + 1, word, wordI + 1) ||
                dfs(board, boardBol, i, j - 1, word, wordI + 1);

        boardBol.clear(i * cols + j);

        return found;
    }

    public static void main(String[] args) throws Exception {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word1 = "ABCCED";
        String word2 = "SEE";
        String word3 = "ABCB";

        System.out.println(exist(board, word1));
        System.out.println(exist(board, word2));
        System.out.println(exist(board, word3));
    }
}
