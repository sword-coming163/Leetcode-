package 笔试.爱奇艺.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:14:35
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().replace("[","").replace("]","").split(",");
        int[] ins = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            ins[i] = new Integer(in[i]);
        }
        int[] res = new int[in.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < ins.length; i++) {
            //下雨
            if (ins[i]!=0){
                if (stack.contains(i)){
                    System.out.println("[]");
                    return;
                }
                stack.push(ins[i]);
                res[i]=-1;
            }else {
                //不下雨
                if (stack.isEmpty()){
                    //湖泊都是干的
                    res[i]=-1;
                }else {
                    res[i] = stack.pop();
                }
            }
        }
        br.close();
        System.out.println(Arrays.toString(res));

    }
    class Solution {
        public int[] avoidFlood(int[] rains) {
            int[] ans = new int[rains.length];
            Arrays.fill(ans, 1);
            Map<Integer, Integer> water = new HashMap<>();
            TreeSet<Integer> zero = new TreeSet<>();
            for(int i = 0; i < rains.length; ++i){
                int rain = rains[i];
                if(rain == 0){//晴天，存下标
                    zero.add(i);
                    continue;
                }
                if(water.containsKey(rain)){//下雨天，且这个湖泊已经下过雨了
                    Integer r = zero.higher(water.get(rain));//找到之前一次下雨的下标所对应的下一个晴天下标
                    if(r == null) return new int[]{};//如果没有满足要求的晴天下标，返回空数组
                    ans[r] = rain;//清空的湖泊下标
                    zero.remove(r);//移除已经使用过的晴天
                }
                water.put(rain, i);//存放下雨的湖泊
                ans[i] = -1;//下雨不能操作
            }
            return ans;
        }
    }
}
