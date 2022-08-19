package JianzhiOfferProject.Day09;

/**
 * @author timwong5
 * @date 2022-08-14 19:26
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) {
            return false;
        }
        return search(A, B);

    }

    public boolean compare(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        } else {
            return A.val == B.val && compare(A.left, B.left) && compare(A.right, B.right);
        }

    }

    public boolean search(TreeNode A, TreeNode B) {
        if (A == null) {
            return false;
        }

        if (A.val == B.val && compare(A, B)) {
            return true;
        } else {
            return search(A.left, B) || search(A.right, B);
        }
    }
}
