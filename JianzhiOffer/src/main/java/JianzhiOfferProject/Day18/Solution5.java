package JianzhiOfferProject.Day18;

import JianzhiOfferProject.Utils.TreeNode;

/**
 * @author timwong5
 * @date 2022-10-15 23:20
 */
public class Solution5 {
    int res, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;

        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        if (k == 0) {
            return;
        }

        if (--k == 0) {
            res = root.val;
        }

        dfs(root.left);
    }
}
