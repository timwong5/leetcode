package JianzhiOfferProject.Day05;

import java.util.HashMap;

/**
 * @author timwong5
 * @date 2022-08-02 14:22
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                index[0] = i;
                index[1] = hashMap.get(nums[i]);
                return index;
            }
            hashMap.put(target - nums[i], i);
        }
        return index;
    }
}
