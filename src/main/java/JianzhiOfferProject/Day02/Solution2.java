package JianzhiOfferProject.Day02;

/**
 * @author timwong5
 * @date 2022-07-21 21:29
 */
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }

        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}