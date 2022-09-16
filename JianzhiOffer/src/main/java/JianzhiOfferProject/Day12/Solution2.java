package JianzhiOfferProject.Day12;

import java.util.HashMap;
import java.util.Map;

/**
 * @author timwong5
 * @date 2022-08-29 23:14
 */
public class Solution2 {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            if (count == null) {
                count = 1;
            } else {
                count = ++count;
            }
            map.put(i, count);
        }


        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int number = Solution2.singleNumber(nums);
        System.out.println(number);

    }
}
