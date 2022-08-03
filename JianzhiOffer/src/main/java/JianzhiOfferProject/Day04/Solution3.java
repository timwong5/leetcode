package JianzhiOfferProject.Day04;

/**
 * @author timwong5
 * @date 2022-08-01 23:20
 */
public class Solution3 {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

