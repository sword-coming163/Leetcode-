package 剑指offer.q4二维数组中的查找.training;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //把二维数组以右上角为顶点进行判断，若target<顶点数组，坐标向左移动，j--;
        //若target>顶点数组大小，i++;
        //初始i= matrix.length.j=0;
        //消除边界条件
        //时间复杂度O（m+n） 空间复杂度O(1)
        if(matrix==null||matrix.length==0||matrix[0].length==0){return false;}
        int i =0;
        int j = matrix[0].length-1;
        while(i<matrix.length&&j>=0){
            if(matrix[i][j]>target){
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
