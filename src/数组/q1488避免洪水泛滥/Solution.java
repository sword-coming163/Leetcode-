package 数组.q1488避免洪水泛滥;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:21:45
 */
public class Solution {
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
