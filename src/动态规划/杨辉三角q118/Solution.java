package 动态规划.杨辉三角q118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        list0.add(1);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        listList.add(list0);
        if (numRows==1){
            return listList;
        }
        listList.add(list1);
        if (numRows==2){
            return listList;
        }
        for (int i = 2; i < numRows; i++) {
            int temp = 0;
            List<Integer> listTemp = listList.get(i-1);
            List<Integer> adList = new ArrayList<>();
            adList.add(1);
            for (int j = 0; j < listTemp.size()-1; j++) {
                temp = listTemp.get(j)+listTemp.get(j+1);
                adList.add(temp);
            }
            adList.add(1);
            listList.add(adList);
        }
        return listList;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().generate(5).toArray()));
    }
}
