package JianzhiOfferProject.Day09;

/**
 * @author timwong5
 * @date 2022-08-18 21:31
 */
public class Solution3 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        else {
            return ifEquals(root.left,root.right);
        }
    }

    private boolean ifEquals(TreeNode root1, TreeNode root2){
        // 退出条件
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null){
            return false;
        }
        //递归判断是否为镜像
        return root1.val == root2.val && ifEquals(root1.left, root2.right)
                && ifEquals(root1.right, root2.left);
    }
}
