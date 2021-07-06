package 回溯法.全排列2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if (nums==null){
            return res;
        }
        Arrays.sort(nums);
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
                if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                    continue;
                }
                path.add(nums[i]);
                used[i] = true;
                dfs(nums,length,res,path,depth+1,used);
                used[i] = false;
                path.remove(path.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(new Solution().permuteUnique(nums));
    }
}
