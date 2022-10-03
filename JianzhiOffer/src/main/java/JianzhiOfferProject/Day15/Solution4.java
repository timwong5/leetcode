package JianzhiOfferProject.Day15;

/**
 * @author timwong5
 * @date 2022-09-25 23:07
 */
public class Solution4 {
    /**
     * 双指针法 对撞
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int s = nums[left] + nums[right];
            if (s < target) {
                left++;
            }
            if (s > target) {
                right--;
            }
            if (s == target) {
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[0];
    }
}
