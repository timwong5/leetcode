package JianzhiOfferProject.Day03;

/**
 * @author timwong5
 * @date 2022-07-23 0:40
 */
public class Solution2 {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n,s.length());
        return s2+s1;
    }
    //Todo 不申请额外空间 解法2
    public String reverseLeftWords2(String s, int n) {
        return s;
    }

}
