package 笔试.vivo.q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String[] strings = in.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            //含有数字7或者是7的倍数
            if (Integer.parseInt(strings[i])%7==0||helper(Integer.parseInt(strings[i]))){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean helper(int num){
        while (num!=0){
            if (num%10==7){
                return true;
            }
            num = num/10;
        }
        return false;
    }
}
