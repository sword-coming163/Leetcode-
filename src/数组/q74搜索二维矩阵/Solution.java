package 数组.q74搜索二维矩阵;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0){
            return false;
        }
        //二话不说，暴力解法
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int x = matrix[mid / n][mid % n];
            if (x < target) {
                low = mid + 1;
            } else if (x > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
