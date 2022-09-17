package JianzhiOfferProject.Day14;

import JianzhiOfferProject.Utils.ListNode;

/**
 * @author timwong5
 * @date 2022-09-17 22:12
 */
public class Solution1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //快慢指针 先让快指针走k步，然后两个指针同步走，
        // 当快指针走到头时，慢指针就是链表倒数第k个节点
        ListNode frontNode = head, behindNode = head;
        while (frontNode != null && k > 0) {
            frontNode = frontNode.next;
            k--;
        }
        while (frontNode != null) {
            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }
        return behindNode;
    }
}
