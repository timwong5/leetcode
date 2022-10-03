package JianzhiOfferProject.Day15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author timwong5
 * @date 2022-09-25 15:58
 */
public class Solution3 {
    public int[] exchange(int[] nums) {
        List jishu = new ArrayList<>();
        List oushu = new ArrayList<>();
        List result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 1) {
                jishu.add(nums[i]);
            }
            if (nums[i] % 2 == 0) {
                oushu.add(nums[i]);
            }
        }

        result.addAll(jishu);
        result.addAll(oushu);

        int[] resultInt = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultInt[i] = (int) result.get(i);
        }

        return resultInt;
    }

    /**
     * 双指针 快排
     *
     * @param nums
     * @return
     */
    public int[] exchange2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            while (nums[left] % 2 == 1) {
                left++;
            }
            while (nums[right] % 2 == 1) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

        }

        return nums;

    }
}
