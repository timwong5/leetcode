package JianzhiOfferProject.Day18;

import JianzhiOfferProject.Utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author timwong5
 * @date 2022-10-03 23:58
 */
public class Solution {

    /**
     * 储存结果
     */
    private List<List<Integer>> res = new ArrayList();
    /**
     * 储存路径
     */
    private LinkedList<Integer> path = new LinkedList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return res;

    }

    private void dfs(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        target = target - root.val;
        path.add(root.val);

        if (root.left == null && root.right == null && target == 0){
            res.add(new LinkedList<>(path));
        }

        dfs(root.left, target);
        dfs(root.right, target);
        // 将本次搜索结果移除，方便其他搜索使用path变量
        path.removeLast();
    }
}
