package 数字操作.阶乘后的零q172;

import java.math.BigInteger;

public class Solution {
    public int trailingZeroes(int n) {

        // Calculate n!
        BigInteger nFactorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i));
        }

        // Count how many 0's are on the end.
        int zeroCount = 0;

        while (nFactorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            nFactorial = nFactorial.divide(BigInteger.TEN);
            zeroCount++;
        }

        return zeroCount;
    }
    public int trailingZeroes1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int N = i;
            while (N > 0) {
                if (N % 5 == 0) {
                    count++;
                    N /= 5;
                } else {
                    break;
                }
            }
        }
        return count;

    }
    public int trailingZeroes2(int n) {
        int zeroCount = 0;
        long currentMultiple = 5;
        while (n > 0) {
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().trailingZeroes2(100));
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.ZERO);
    }
}
