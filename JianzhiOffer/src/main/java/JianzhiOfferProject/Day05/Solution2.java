package JianzhiOfferProject.Day05;

/**
 * @author timwong5
 * @date 2022-08-02 23:44
 */
public class Solution2 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
