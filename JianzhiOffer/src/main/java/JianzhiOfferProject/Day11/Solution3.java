package JianzhiOfferProject.Day11;

import java.util.*;


/**
 * @author timwong5
 * @date 2022-08-23 16:00
 */
public class Solution3 {


    /**
     * 给定一个不含重复数字的数组 nums ，
     * 返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {


        int len = nums.length;

        List<List<Integer>> res = new ArrayList<>();
        if (len == 0){
            return res;
        }

        Deque<Integer> path = new ArrayDeque<Integer>();

        boolean[] used = new boolean[len];


        dfs(nums, len, 0, path, used, res);

        return res;
    }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == len){
            // 使用new ArrayList<>(path) 将path的拷贝加入res
            // 如果不拷贝 直接res.add(path) 因为回溯的过程中 path最后为空 寄了
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (used[i] == true){
                continue;
            }

            path.addLast(nums[i]);
            used[i] = true;

            dfs(nums, len, depth+1, path, used, res);
            //回溯 操作之前做了什么操作后就要反过来
            path.removeLast();
            used[i] = false;
        }

    }


}
