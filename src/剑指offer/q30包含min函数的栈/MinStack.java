package 剑指offer.q30包含min函数的栈;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> min;
    public MinStack() {
        stack = new LinkedList<>();
        min = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty()||x<=min.peek()){
            min.push(x);
        }
    }

    public void pop() {
        System.out.println(stack.peek());
        System.out.println(min.peek());
        if (stack.peek()==min()){
            stack.pop();
            min.pop();
        }else {
            stack.pop();
        }


    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());

    }
}
