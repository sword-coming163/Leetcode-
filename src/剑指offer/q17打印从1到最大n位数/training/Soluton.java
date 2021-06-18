package 剑指offer.q17打印从1到最大n位数.training;

import java.util.Arrays;

public class Soluton {
    public int[] printNumbers(int n) {
        int count = (int) Math.pow(10,(double) n);
        int[] res = new int[count-1];
        for(int i = 0;i<count-1;i++){
            res[i] = i+1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Soluton().printNumbers(2)));
    }
}
