package 数组.螺旋矩阵q54;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arrayList = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return arrayList;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i =0;
        int j = 0;
        boolean[][] visited = new boolean[m][n];
        int direction = 1;

        while (true){
            // 设置出口
            if(i<0||j<0||i==m||j==n||visited[i][j]){
                break;
            }
            arrayList.add(matrix[i][j]);
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
        return arrayList;
    }
    public static void main(String[] args) {

       int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        solution solution = new solution();
        System.out.println(solution.spiralOrder(arr));

    }
}
