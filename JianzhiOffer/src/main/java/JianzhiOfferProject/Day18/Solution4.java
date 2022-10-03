package JianzhiOfferProject.Day18;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。
 * A 不能视为 14。
 *
 * @author timwong5
 * @date 2022-10-15 18:00
 */
public class Solution4 {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0;
        int min = 14;

        for (int num : nums) {
            if (num == 0){
                continue;
            }
            // 最大牌 最小牌
            max = Math.max(max, num);
            min = Math.min(min, num);

            // 若有重复，提前返回 false
            if(repeat.contains(num)) {
                return false;
            }
            // 添加此牌至 Set
            repeat.add(num);

        }
        //最大-最小小于5 顺子
        return max - min < 5;
    }
}
