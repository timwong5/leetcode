package JianzhiOfferProject.Day16;

/**
 * 剑指 Offer 12. 矩阵中的路径
 *
 * @author timwong5
 * @date 2022-09-26 23:53
 */
public class Solution2 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 当前元素在矩阵 board 中的行列索引 i 和 j ，当前目标字符在 word 中的索引 k
     *
     * @param board
     * @param word
     * @param i
     * @param j
     * @param k
     * @return
     */
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) {
            return false;
        }
        if (k == word.length - 1) {
            return true;
        }
        // 标记当前矩阵元素： 将 board[i][j] 修改为 空字符 '' ，代表此元素已访问过，防止之后搜索时重复访问
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);

        board[i][j] = word[k];
        return res;

    }
}
