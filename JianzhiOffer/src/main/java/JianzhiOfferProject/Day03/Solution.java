package JianzhiOfferProject.Day03;

/**
 * @author timwong5
 * @date 2022-07-22 17:13
 */
public class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }

    public String replaceSpace2(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c==' '){
                sb.append("%20");
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}
