package 剑指offer.q64求和;

public class Solution {
    public int sumNums1(int n) {
        return  n*(n+1)/2;
    }
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }

}
