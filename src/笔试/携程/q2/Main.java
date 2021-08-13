package 笔试.携程.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/12 18:46
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        int[][] nums = new int[10][10];
        nums[0][0] = 6;
        nums[0][1] = 4;
        nums[0][2] = 3;
        nums[0][3] = 3;
        nums[0][4] = 4;
        nums[0][5] = 3;
        nums[0][6] = 2;
        nums[0][7] = 3;
        nums[0][8] = 1;
        nums[0][9] = 2;
        nums[1][1] = 2;
        nums[1][2] = 5;
        nums[1][3] = 3;
        nums[1][4] = 2;
        nums[1][5] = 5;
        nums[1][6] = 6;
        nums[1][7] = 1;
        nums[1][8] = 5;
        nums[1][9] = 4;
        nums[2][2] = 5;
        nums[2][3] = 2;
        nums[2][4] = 5;
        nums[2][5] = 4;
        nums[2][6] = 3;
        nums[2][7] = 5;
        nums[2][8] = 2;
        nums[2][9] = 3;
        nums[3][3] = 5;
        nums[3][4] = 3;
        nums[3][5] = 2;
        nums[3][6] = 3;
        nums[3][7] = 2;
        nums[3][8] = 2;
        nums[3][9] = 1;
        nums[4][4] = 4;
        nums[4][5] = 3;
        nums[4][6] = 4;
        nums[4][7] = 3;
        nums[4][8] = 3;
        nums[4][9] = 2;
        nums[5][5] = 5;
        nums[5][6] = 1;
        nums[5][7] = 4;
        nums[5][8] = 2;
        nums[5][9] = 1;
        nums[6][6] = 6;
        nums[6][7] = 5;
        nums[6][8] = 1;
        nums[6][9] = 2;
        nums[7][7] = 3;
        nums[7][8] = 4;
        nums[7][9] = 3;
        nums[8][8] = 7;
        nums[8][9] = 1;
        nums[9][9] = 6;
        int length = str.length();
        int[] sum = new int[length+1];
        for (int i = 1; i <=length ; i++) {
            for (int k = 0; k < i; k++) {
                int temp = Character.getNumericValue(str.charAt(k));
                sum[i] += nums[temp][temp];
            }
            for (int j = 2; j <=length-i+1; j++) {
                int temp11 = Character.getNumericValue(str.charAt(j-1));
                int temp12 = Character.getNumericValue(str.charAt(j-2));
                sum[i] += temp11>temp12?nums[temp12][temp11]:nums[temp11][temp12];
                if (i!=1){
                    int temp21 = Character.getNumericValue(str.charAt(j+i-2));
                    int temp22 = Character.getNumericValue(str.charAt(j+i-3));
                    sum[i]+= temp21>temp22?nums[temp22][temp21]:nums[temp21][temp22];
                }

            }
        }
        for (int i = 1; i < sum.length; i++) {
            System.out.print(sum[i]+" ");
        }

    }
}
