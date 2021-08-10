package 笔试.荣耀.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/7:17:56
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> in = new ArrayList<>();
        while (true){
            String s = br.readLine();
            if (s.charAt(0)=='0'&&s.charAt(2)=='0'){
                break;
            }
            in.add(s);
        }
        for (int i = 0; i <in.size();i++) {
            String[] strings = in.get(i).split(" ");
            int N0 = Integer.parseInt(strings[0]);
            int L1 = Integer.parseInt(strings[1]);
            BigDecimal res01,res02,res03,N;
            N = BigDecimal.valueOf(N0);
            res01 = N.pow(L1).multiply(N);
            res02 = N.subtract(res01);
            res03 = res02.divide(BigDecimal.ONE.subtract(N));
            BigDecimal s = BigDecimal.valueOf(1000000007);
            System.out.println(res03.divideAndRemainder(s)[1].toString());
        }
        br.close();
    }

}
