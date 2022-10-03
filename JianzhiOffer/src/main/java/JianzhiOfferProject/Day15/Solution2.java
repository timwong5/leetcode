package JianzhiOfferProject.Day15;

import JianzhiOfferProject.Utils.ListNode;

/**
 * @author timwong5
 * @date 2022-09-25 13:08
 */
public class Solution2 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode n1 = headA;
        ListNode n2 = headB;

        while (n1 != n2) {
            n1 = n1 == null ? headB : n1.next;
            n2 = n2 == null ? headA : n2.next;
        }
        return n1;
    }
}
