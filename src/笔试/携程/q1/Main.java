package 笔试.携程.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: 使用动态规划
 * @date 2021/8/12 18:46
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(in1[0]);
        int K = Integer.parseInt(in1[1]);
        String[] in2 = br.readLine().split(" ");
        int[] nums = new int[in2.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(in2[i]);
        }
        double[][] dp = new double[N+1][N+1];
        double count = 0;
        for (int i = 0; i < K; i++) {
            count = count+nums[i];
        }
        double max = 0;
        dp[K-1][0] = count/K;
        for (int i = K; i < N; i++) {
            dp[i][0] = (dp[i-1][0]*(i)+nums[i])/(i+1);
        }
        int length = 0;
        for (int i = K-1; i < N; i++) {
            for (int j = 1; j < N-i; j++) {
                dp[i][j] = (dp[i][j-1]*(i+1)-nums[j-1]+nums[j+i])/(i+1);
                if (dp[i][j]>=max){
                    length = Math.max(length,i);
                    max = dp[i][j];
                }
            }
        }
        br.close();
        for (int i = 0; i < N; i++) {
            if (dp[length][i]==max){
                System.out.println(i);
                System.out.println(i+length);
            }
        }
    }
}
