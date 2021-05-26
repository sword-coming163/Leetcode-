package 剑指offer.q06从尾到头打印链表;

import java.util.*;

public class Solution {
    //使用栈进行返回
    public int[] reversePrint1(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();
        ListNode curr = head;
        while (curr!=null){
            stack.push(curr.val);
            curr = curr.next;
        }
        int[] nums = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()){
            nums[i] = stack.pop();
            i++;
        }
        return nums;
    }
    public int[] reversePrint(ListNode head){
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while (curr!=null){
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(list);
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,2};
        ListNode head= new ListNode(nums);
        System.out.println(head);
        System.out.println(Arrays.toString(new Solution().reversePrint(head)));
    }
}
