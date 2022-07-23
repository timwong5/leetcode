package JianzhiOfferProject.Day04;

import java.util.HashSet;
import java.util.Set;

/**
 * @author timwong5
 * @date 2022-07-23 20:14
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        int temp = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) == false){
                temp = nums[i];
                break;
            }
        }
        return temp;
    }
}
