package 栈.最小栈q155;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 设计一个支持push,pop,top,并在常数时间检索到最小与元素的栈
 */
public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack(){
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int val){
        stack.push(val);
        minStack.push(Math.min(val,minStack.peek()));
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }
    public int top(){
         return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        System.out.println(Integer.MAX_VALUE);
    }
}
