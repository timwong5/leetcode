package JianzhiOfferProject.Day07;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author timwong5
 * @date 2022-08-05 9:49
 */
public class Solution {
    public int[] levelOrder(TreeNode root) {
        //通过引入一个队列来支撑层序遍历
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        queue.add(root);

        if (root == null) {
            return new int[0];
        }


        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }


        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;

    }
}

