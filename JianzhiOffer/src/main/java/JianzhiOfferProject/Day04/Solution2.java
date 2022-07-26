package JianzhiOfferProject.Day04;

/**
 * @author timwong5
 * @date 2022-07-26 17:46
 */
public class Solution2 {
    public int search(int[] nums, int target) {
        //二分查找
        int pos;
        int left = 0, right = nums.length;
        //二分搜索左边界
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                right = mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid;
            }
        }
        int leftIndex = left;
        //二分搜索右边界
        left = 0;
        right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                left = mid+1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid;
            }
        }
        int rightIndex = right;
        return rightIndex - leftIndex;
    }
}

