package JianzhiOfferProject.Day07;

import java.util.*;

/**
 * @author timwong5
 * @date 2022-08-05 15:22
 */
public class Solution4 {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null) {
//            return res;
//        }
//
//        // 我们使用LinkedList来作为我们的队列
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//
//            List<Integer> level = new ArrayList<>();
//            int num = queue.size();
//
//            for (int i = 0; i < num; i++) {
//                TreeNode node = queue.remove();
//                level.add(node.val);
//
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//                if (node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//            res.add(level);
//        }
//
//        for (int i = 1; i < res.size(); i += 2) {
//            Collections.reverse(res.get(i));
//        }
//        return res;
//    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        //使用双端队列
        Deque<TreeNode> nodeQueue = new ArrayDeque<TreeNode>();
        nodeQueue.offer(root);
        boolean isOrderLeft = true;


        while (!nodeQueue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<>();
            int num = nodeQueue.size();

            for (int i = 0; i < num; i++) {
                TreeNode curNode = nodeQueue.poll();
                if (isOrderLeft) {
                    levelList.offerLast(curNode.val);
                } else {
                    levelList.offerFirst(curNode.val);
                }
                if (curNode.left != null) {
                    nodeQueue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    nodeQueue.offer(curNode.right);
                }
            }
            //使用levelList创建新的LinkedList 并且加到res里 单次循环加当前的
            res.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return res;
    }
}
