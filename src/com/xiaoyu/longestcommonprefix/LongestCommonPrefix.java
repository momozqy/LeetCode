package com.xiaoyu.longestcommonprefix;

/**
 * Created by momo on 2017/7/19.
 */
public class LongestCommonPrefix {
    public static void main(String[]args){
        System.out.print(new LongestCommonPrefix().longestCommonPrefix(new String[]{"adfsafgbsfjdfkha","adsfbsfbc","sbsf"}));
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        int len = 2;
        String res  = getLongestCommonPrefix(strs[0],strs[1]);
        for(;len<strs.length;len++){
            res = getLongestCommonPrefix(res,strs[len]);
        }
        return res;
    }
    public String getLongestCommonPrefix(String str1,String str2){
        int size1 = str1.length();
        int size2 = str2.length();
        if(size1==0||size2==0)
            return "";
        int longest = 0;
        String longestStr="";
        for(int i=0;i<size1;i++) {
            int indexi = i;
            for (int j = 0; j < size2; j++) {
                int indexj = j;
                int start = j;
                while(str2.charAt(j)==str1.charAt(i)){
                    j++;
                    i++;
                    if(j>(size2-1)||i>(size1-1))
                        break;
                }
                int end = j;
                if(end-start>longest){
                    longest = end-start;
                    longestStr = str2.substring(start,end);
                }
                i = indexi;
                j = indexj;
            }
        }
        return longestStr;
    }
}
