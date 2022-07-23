package JianzhiOfferProject.Day01;

import java.util.Stack;

/**
 * @author timwong5
 * @date 2022-07-20 22:14
 */
public class CQueue {
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();


    public CQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (!s2.isEmpty()){
            return s2.pop();
        }
        else {
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            if (s2.isEmpty()){
                return -1;
            }
            else return s2.pop();
        }
    }


}
