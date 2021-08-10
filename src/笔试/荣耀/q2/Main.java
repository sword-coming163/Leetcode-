package 笔试.荣耀.q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang
 * @title: Main
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/7:17:56
 */
//This,is,an,eggplant,of,our,beautifull,sweety,baby
//        16
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = br.readLine().split(",");
        int maxWidth = Integer.parseInt(br.readLine());
        final String[] space = new String[maxWidth+1];
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < maxWidth+1; i++) {
            space[i] = s.toString();
            s.append("*");
        }
        List<String> pWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int curlen = words[i].length();
            int startI = i;
            while (i< words.length-1&&curlen<maxWidth){
                i++;
                curlen = curlen+words[i].length()+1;
            }
            if (curlen>maxWidth){
                curlen = curlen-words[i].length()-1;
                i--;
            }
            pWords.add(processCurline(words,startI,i,curlen,maxWidth,space));
        }
        for (int i = 0; i < pWords.size(); i++) {
            System.out.println(pWords.get(i));
        }
        br.close();
    }
    public static String processCurline(String[] words,int si,int ei,int curlen,int maxWidth,String[] space){
        StringBuffer sb = new StringBuffer();
        int map = ei-si;
        int addSpace = maxWidth-curlen+map;
        if (map==0){
            sb.append(words[ei]);
            sb.append(space[addSpace]);
            return sb.toString();
        }
        if (ei==words.length-1){
            for (int i = si; i < ei; i++) {
                sb.append(words[i]).append("*");
            }
            sb.append(words[ei]);
            sb.append(space[addSpace-map]);
            return sb.toString();
        }
        int allAddSpace = addSpace/map;
        int left = addSpace%map+si;
        for (int i = si; i < ei; i++) {
            sb.append(words[i]).append(space[allAddSpace]);
            if (i<left){
                sb.append("*");
            }
        }
        sb.append(words[ei]);
        return sb.toString();
    }
}
