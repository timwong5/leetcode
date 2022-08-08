package JianzhiOfferProject.Day06;

/**
 * @author timwong5
 * @date 2022-08-03 17:08
 */
public class Solution3 {
    public char firstUniqChar(String s) {
        if ("".equals(s)) {
            return ' ';
        }
        //创建字母字典
        int[] target = new int[26];
        //统计每个字母出现了几次
        for (int i = 0; i < s.length(); i++) {
            target[s.charAt(i) - 'a']++;
        }
        //第二次遍历，从字典数组获取次数
        for (int i = 0; i < s.length(); i++) {
            if (target[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
