package JianzhiOfferProject.Day09;

/**
 * @author timwong5
 * @date 2022-08-18 14:47
 */
public class Solution2 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        //swap
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

}
