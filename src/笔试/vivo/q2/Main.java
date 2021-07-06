package 笔试.vivo.q2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //定义输入
        Scanner scanner = new Scanner(System.in);
        int W = Integer.parseInt(scanner.nextLine());
        String wstring = scanner.nextLine();
        String[] wstrings = wstring.split(",");
        String vstring = scanner.nextLine();
        String[] vstrings = vstring.split(",");
        int[] w = new int[wstrings.length];
        int[] v = new int[vstrings.length];
        int N = wstrings.length;
        for (int i = 0; i < wstrings.length; i++) {
            w[i] = Integer.parseInt(wstrings[i]);
        }
        for (int i = 0; i < vstrings.length; i++) {
            v[i] = Integer.parseInt(vstrings[i]);
        }
//        int[][] dp = new int[N+1][W+1];
        //优化，使用一维的滚动数组反向
        int[] dp = new int[W+1];
        //如果要求恰好装满背包
//        那么在初始化时除了dp[0]为0外，其余初始化为负无穷
        //如果只是追求价格的最大，并不要求全部装满，则可以初始化为0
//        for (int i = 1; i < W+1; i++) {
//            dp[i] = Integer.MIN_VALUE;
//        }
        for (int i = 0; i < N; i++) {
            // 0-1背包
            for (int j = W; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j-w[i]]+v[i]);
//                System.out.println(Arrays.toString(dp));
            }
            System.out.println(Arrays.toString(dp));
//            //完全背包
//            for (int j = w[i]; j <=W ; j++) {
//                dp[j] = Math.max(dp[j],dp[j-w[i]]+v[i]);
//
//            }
//            System.out.println(Arrays.toString(dp));

        }
//        int max = 0;
//        for (int i = 0; i < W+1; i++) {
//            max = Math.max(max,dp[i]);
//        }
        System.out.println(dp[W]);
    }
}
