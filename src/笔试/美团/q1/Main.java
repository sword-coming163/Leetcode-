package 笔试.美团.q1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/8 9:08
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Total = Integer.parseInt(br.readLine());
        String[] s1 = new String[Total];
        String[] s2 = new String[Total];
        int index = 0;
        while (index<Total){
            s1[index] = br.readLine();
            s2[index] = br.readLine();
            index++;
        }
        for (int i = 0; i < Total; i++) {
            int k = Integer.parseInt(s1[i].split(" ")[1]);
            String[] temp = s2[i].split(" ");
            int[] in = new int[temp.length];
            for (int j = 0; j < temp.length; j++) {
                in[j] = Integer.parseInt(temp[j]);
            }
            Arrays.sort(in);
            if (in[k-1]<k){
                if (k<temp.length&&in[k]>=in[k-1]){
                    System.out.println("NO");
                }else {
                    System.out.println("YES");
                    System.out.println(in[k-1]+1);
                }
            }else {
                System.out.println("NO");
            }
        }
        br.close();
    }
}

