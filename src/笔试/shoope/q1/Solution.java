package 笔试.shoope.q1;

import javax.swing.text.Document;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/2:18:30
 */
public class Solution {
//    "<people><name>shopee</name></people>","people.name"
    public String GetXMLValue(String inxml, String path) {
        if (inxml==null||path==null||inxml.isEmpty()||path.isEmpty()){
            return "";
        }
        // write code here
        String[] subs = path.split("\\.");
        for (int i = 0; i < subs.length; i++) {
            int  indexbegin = inxml.indexOf("<"+subs[i]+">")+subs[i].length()+1;
            int indexedn = inxml.indexOf("</"+subs[i]+">");
            if (indexbegin<=0||indexedn<=0||indexedn>indexbegin||indexedn>inxml.length()-subs[i].length()-2){
                return "";
            }
            inxml = inxml.substring(indexbegin+1,indexedn);
        }
        return inxml;
    }

    public static void main(String[] args) {
        String s1 = "<people><name>shopee</name></people>";
        String s2 = "people.age";
        System.out.println(new Solution().GetXMLValue(s1,s2));
}}
