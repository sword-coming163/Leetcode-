package 栈.用栈实现队列q232;
import java.util.Deque;
import java.util.LinkedList;


public class MyQueue {
    Deque<Integer> s1;
    Deque<Integer> s2;
    int front;
    public MyQueue() {
        s1 = new LinkedList<Integer>();
        s2 = new LinkedList<Integer>();

    }

    public void push(int x) {
        if (s1.isEmpty()){
            front = x;
        }
        s1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }

        }
        int x=  s2.pop();
        return x;
    }

    /** Get the front element. */
    public int peek() {
        if (!s2.isEmpty()){
            front = s2.peek();
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}
