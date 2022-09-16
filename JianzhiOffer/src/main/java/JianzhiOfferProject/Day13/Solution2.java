package JianzhiOfferProject.Day13;

/**
 * @author timwong5
 * @date 2022-09-02 22:59
 */
public class Solution2 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        if (head.val != val) {
            head.next = deleteNode(head.next, val);
        }
        return head;
    }
}
