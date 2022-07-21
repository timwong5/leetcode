package JianzhiOfferProject.Day01;

import java.util.Stack;

/**
 * @author timwong5
 * @date 2022-07-20 22:53
 */
public class MinStack {

    Stack<Integer> s1;
    Stack<Integer> min;

    /** initialize your data structure here. */
    public MinStack() {
        s1 = new Stack<Integer>();
        min = new Stack<Integer>();
        min.push(Integer.MAX_VALUE);
    }


    public void push(int x) {
        s1.push(x);
        //peek()方法用于从此Stack中返回顶部元素,并且它不删除就检索元素
        min.push(Math.min(x,min.peek()));
    }

    public void pop() {
        s1.pop();
        min.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return min.peek();
    }


}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
