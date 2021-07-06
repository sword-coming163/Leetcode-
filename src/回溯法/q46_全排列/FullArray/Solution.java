package 回溯法.q46_全排列.FullArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> fullArray(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if (nums==null){
            return res;
        }
        //定义一个用于判断是否已经被访问的临时数组
        boolean[] used = new boolean[nums.length];
        dfs(nums,nums.length,res,path,0,used);
        return res;
    }

    private void dfs(int[] nums, int length, List<List<Integer>> res, List<Integer> path, int depth,boolean[] used) {
        if (depth==length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!used[i]){
                path.add(nums[i]);
                used[i] = true;
                dfs(nums,length,res,path,depth+1,used);
                used[i] = false;
                path.remove(path.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(new Solution().fullArray(nums));
    }
}
