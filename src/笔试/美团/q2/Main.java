package 笔试.美团.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        String s = br.readLine().replaceAll("\\s*","");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.charAt(0));
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            if (stringBuilder.charAt(index)==s.charAt(i)){
                continue;
            }
            stringBuilder.append(s.charAt(i));
            index++;
        }
        System.out.println(stringBuilder.toString());
        br.close();
    }
}
