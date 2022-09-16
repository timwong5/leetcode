package JianzhiOfferProject.Day12;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，
 * ……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 * @author timwong5
 * @date 2022-08-24 16:48
 */
public class Solution1 {

    /**
     * 评论解法 待理解
     *
     * @param num
     * @return
     */
    public int translateNum(int num) {
        if (num <= 9) {
            return 1;
        }

        int remainder = num % 100;
        if (remainder <= 9 || remainder >= 26) {
            return translateNum(num / 10);
        } else {
            return translateNum(num / 10) + translateNum(num / 100);
        }

    }

    public int translateNum2(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= s.length(); i++) {

            String temp = s.substring(i - 2, i);
            // 如果a比b小,那么返回 <0,相等就是0,否则就是>0
            if (temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0){
                dp[i] = dp[i-1]+ dp[i-2];
            }
            else {
                dp[i] = dp[i-1];
            }

        }
        return dp[s.length()];

    }
}
