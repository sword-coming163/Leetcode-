package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    List<Integer> list = new ArrayList<>(10);
    List<Integer> list1 = new ArrayList<Integer>(new ArrayList<>(10));

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        List<Integer> list1 = new ArrayList<Integer>(list);
        System.out.println(list);
        HashMap<String,Integer> integerHashMap = new HashMap<>();

    }}

