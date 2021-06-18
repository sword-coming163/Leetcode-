package 笔试.vivo.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()){
            list.add(scanner.nextInt());
        }
        System.out.println(list.toString());
    }
}

