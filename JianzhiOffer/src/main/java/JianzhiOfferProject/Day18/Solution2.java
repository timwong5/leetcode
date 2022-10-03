package JianzhiOfferProject.Day18;

import JianzhiOfferProject.Utils.Node;

/**
 * @author timwong5
 * @date 2022-10-04 9:52
 */
public class Solution2 {
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }


        dfs(root);

        //构建双向链表
        head.left = pre;
        //此处pre指向尾节点
        pre.right = head;
        return head;

    }

    private void dfs(Node cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.left);
        if (pre != null) {
            pre.right = cur;
        } else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }

}
