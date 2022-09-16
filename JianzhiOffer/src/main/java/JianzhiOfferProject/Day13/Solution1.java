package JianzhiOfferProject.Day13;

import java.util.HashMap;
import java.util.Map;

/**
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 * @author timwong5
 * @date 2022-08-31 10:44
 */
public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        //哈希表统计： 遍历字符串s 时，使用哈希表（记为 dic）统计 各字符最后一次出现的索引位置 。
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;

        for (int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1);
            // 更新哈希表
            dic.put(s.charAt(j), j);
            // dp[j - 1] -> dp[j]
            tmp = tmp < j - i ? tmp + 1 : j - i;
            // max(dp[j - 1], dp[j])
            res = Math.max(res, tmp);

        }
        return res;

    }
}
