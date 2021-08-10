package 笔试.美团.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/8 9:08
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        int[] prev = new int[len];
        for (int i = 0; i < len; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i-1; j >=0; j--) {
                if (nums[j]<nums[i]){
                    max = Math.max(nums[j],max);
                }
            }
            prev[i] = max == Integer.MIN_VALUE?0:max;
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + prev[i]*(i+1);
        }
        System.out.println(sum);
        br.close();
    }
}
