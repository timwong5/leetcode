package JianzhiOfferProject.Day02;

import java.util.ArrayList;

/**
 * @author timwong5
 * @date 2022-07-21 10:02
 */
public class Solution {

    ArrayList<Integer> tmp = new ArrayList<Integer>();

    public int[] reversePrint(ListNode head) {
        recu(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }

    public void recu(ListNode head) {
        if (head != null) {
            reversePrint(head.next);
            tmp.add(head.val);
        }
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
