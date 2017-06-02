package com.xiaoyu.reversestring2;

/**
 * Created by lhy on 17/6/2.
 */
public class ReverseStringII {
    public static void main(String args[]){
        System.out.println(new ReverseStringII().reverseStr("abcdefgdhfkdlsdjflk",4));
    }
    public String reverseStr(String s, int k) {
        int len  = s.length();
        String result = "";
        int count = 0;
        for(int i=1;i<=len;i+=k){
            int end = (count+1)*k>len?len:(count+1)*k;
            if(count%2==0) {
                result += getString(s.substring(i - 1, end));
            }
            else{
                result += s.substring(i - 1, end);
            }
            count++;
        }
        return result;
    }
    public String getString(String str){
        String res = "";
        for(int j=str.length()-1;j>=0;j--){
            res += str.charAt(j);
        }
        return res;
    }
}
