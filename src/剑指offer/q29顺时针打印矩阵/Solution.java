package 剑指offer.q29顺时针打印矩阵;


public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return null;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i =0;
        int j = 0;
        boolean[][] visited = new boolean[m][n];
        int[] nums = new int[m*n];
        int index= 0;
        int direction = 1;

        while (true){
            // 设置出口
            if(i<0||j<0||i==m||j==n||visited[i][j]){
                break;
            }
            nums[index] = matrix[i][j];
            index++;
            visited[i][j]=true;
            switch (direction){
                case 1:{
                    if(j+1==n||visited[i][j+1]){
                        direction = 2;
                        i++;
                        break;
                    }
                    else {
                        j++;
                    }
                    break;
                }
                case 2:{
                    if(i+1==m||visited[i+1][j]){
                        direction = 3;
                        j--;
                        break;
                    }
                    else {
                        i++;
                    }
                    break;
                }
                case 3:{

                    if(j==0||visited[i][j-1]){
                        direction = 4;
                        i--;
                        break;
                    }
                    else {
                        j--;
                    }
                    break;
                }
                case 4:{

                    if(visited[i-1][j]){
                        direction = 1;
                        j++;
                        break;
                    }
                    else {
                        i--;
                    }

                }
                default:
                    break;
            }
        }
        return nums;
    }
}
