package 字符串.q165比较版本号;

import java.util.Arrays;

public class Solution {

    public int compareVersion(String version1, String version2) {
        String[] version01 = version1.split("\\.");
        String[] version02 =version2.split("\\.");
        int i = 0;
        int j = 0;
        while (i<version01.length&&j<version02.length){
            if (Integer.parseInt(version01[i])>Integer.parseInt(version02[i])){
                return 1;
            }else if (Integer.parseInt(version01[i])<Integer.parseInt(version02[i])){
                return -1;
            }
            i++;
            j++;
        }
        if (version01.length==i&&version02.length==j){
            return 0;
        }else if (version01.length==i&&version02.length!=j){
            for (int k = j; k < version02.length; k++) {
                if (Integer.parseInt(version02[k])!=0){
                    return -1;
                }
            }
            return 0;
        }else {
            for (int k = i; k < version01.length; k++) {
                if (Integer.parseInt(version02[k])!=0){
                    return 1;
                }
            }
            return 0;
        }

    }

    public static void main(String[] args) {
        String s1 = "1.0";
        String s2 = "1.0.0";
        System.out.println(Arrays.toString(s1.split("\\.")));
        System.out.println(new Solution().compareVersion(s1,s2));
    }
}
