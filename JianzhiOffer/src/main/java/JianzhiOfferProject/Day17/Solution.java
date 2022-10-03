package JianzhiOfferProject.Day17;

/**
 * 面试题13. 机器人的运动范围
 *
 * @author timwong5
 * @date 2022-09-27 19:10
 */
public class Solution {
    public int movingCount(int m, int n, int k) {
        if (k == 0) {
            return 1;
        }
        boolean[][] visted = new boolean[m][n];
        int ans = 1;
        visted[0][0] = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 0) || get(i) + get(j) > k) {
                    continue;
                }
                // 边界判断
                if (i - 1 >= 0) {
                    visted[i][j] |= visted[i - 1][j];
                }
                if (j - 1 >= 0) {
                    visted[i][j] |= visted[i][j - 1];
                }
                ans += visted[i][j] ? 1 : 0;

            }
        }
        return ans;
    }

    /**
     * 定义一个函数 计算位数和
     *
     * @param x
     * @return
     */
    private int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }


}
