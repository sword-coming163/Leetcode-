package 笔试.美团.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        int length = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        if (length==0){
            System.out.println(0);
        }
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length/2; i++) {
            if (nums[i]!=nums[i+length/2]){
                if (set.contains(nums[i])){
                    continue;
                }
                set.add(nums[i]);
            }
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = length-1; i > length/2-1; i--) {
            if (nums[i]!=nums[i-length/2]){
                if (set2.contains(nums[i])){
                    continue;
                }
                set2.add(nums[i]);
            }
        }
        System.out.println(Math.min(set.size(),set2.size()));
        br.close();
    }
}
