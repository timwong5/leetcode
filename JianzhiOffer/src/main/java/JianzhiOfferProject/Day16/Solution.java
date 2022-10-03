package JianzhiOfferProject.Day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author timwong5
 * @date 2022-09-26 16:08
 */
public class Solution {
    public String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // "\s" 指代空格 前一个\ 转义符
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
