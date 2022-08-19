package JianzhiOfferProject.Day10;

import JianzhiOfferProject.Day08.Solution;

/**
 * @author timwong5
 * @date 2022-08-19 10:29
 */
public class Solution1 {
    /**
     * 递归解法 超时
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    /**
     * 动态规划解法
     *
     * @param n
     * @return
     */
    public int fib2(int n) {
        int MOD = 1000000007;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%MOD;
        }

        return dp[n];


    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int fib2 = s.fib2(15);
        System.out.println(fib2);
    }
}
