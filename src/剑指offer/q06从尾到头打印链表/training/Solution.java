package 剑指offer.q06从尾到头打印链表.training;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] reversePrint(ListNode head){
        //可以遍历链表使用栈暂存 时间复杂度O(N) 空间复杂度O(N)
        if(head==null){
            return new int[0];
        }
        ListNode curr = head;
        Deque<Integer> stack = new LinkedList<>();
        while(curr!=null){
            stack.push(curr.val);
            curr = curr.next;
        }
        int count = stack.size();
        int[] res = new int[count];
        int index = 0;
        while(!stack.isEmpty()){
            res[index++] = stack.pop();
        }
        return res;

    }
}
