package JianzhiOfferProject.Day10;

/**
 * @author timwong5
 * @date 2022-08-19 23:58
 */
public class Solution2 {

    /**
     * 买卖股票 经典题
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        //判断跳出
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        //如果prices[i]大于min，则去更新一下利润res
        //否则说明当前的prices[i]比min还小，则更新min
        int res = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            } else {
                res = Math.max(res, prices[i] - min);
            }
        }

        return res;


    }
}
