package 牛客ACM模式.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author zhang
 * @title: BufferTest
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:10:10
 */
public class BufferTest {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        System.out.println(s);
        String[] s02 = s2.split(" ");
        System.out.println(Arrays.toString(s02));
        String s3 = bufferedReader.readLine();
        String[] s03 = s3.split(",");
        System.out.println(Arrays.toString(s03));

    }
}
