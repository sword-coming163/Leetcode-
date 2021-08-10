package 笔试.爱奇艺.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:14:35
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String sub1 = s.substring(0,s.length()-2);
        String[] split = sub1.split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        String sub2 = s.substring(s.length()-1);
        int length = Integer.parseInt(sub2);
        double max = max(nums,length);
        DecimalFormat df = new DecimalFormat("0.00%");
        String s1 = df.format(max);
        bufferedReader.close();
        System.out.println(s1);
    }
    public static double max(int[] nums, int length){
        if (nums==null||nums.length<length){
            return 0;
        }
        double maxValue = 0;
        double pre = 0;
        double curr =0;
        double preavg = 0;
        double curravg = 0;
        for (int i = 0; i < length; i++) {
            curr +=nums[i];
        }
        for (int i = length; i < nums.length; i++) {
            pre  = curr;
            curr = curr-nums[i-length]+ nums[i];
            preavg = pre/length;
            curravg = curr/length;
            maxValue = Math.max((curravg-preavg)/preavg,maxValue);
        }
        return maxValue;
    }
}
