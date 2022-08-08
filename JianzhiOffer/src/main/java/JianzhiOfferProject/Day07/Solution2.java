package JianzhiOfferProject.Day07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author timwong5
 * @date 2022-08-05 13:15
 */
public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        // 我们使用LinkedList来作为我们的队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            List<Integer> level = new ArrayList<>();
            int num = queue.size();

            for (int i = 0; i < num; i++) {
                TreeNode node = queue.remove();
                level.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
