package com.xiaoyu.palindromenumber;

/**
 * Created by momo on 2017/7/17.
 */
public class PalindromeNumber {
    public static void main(String[] args){
        System.out.print(new PalindromeNumber().isPalindrome2(1221));
    }
    public boolean isPalindrome(int x) {
        boolean flag = false;
        if(x<0)
            return flag;
        int result = 0;
        int origin = x;
        while(x!=0){
           int tail = x%10;
           int newResult = result*10+tail;
           if((newResult-tail)/10!=result){
               return false;
           }
           result = newResult;
           x = x/10;
        }
        if(result==origin)
            return true;
        return flag;
    }

    boolean isPalindrome2(int x) {
        if(x<0|| (x!=0 &&x%10==0)) return false;
        int sum=0;
        while(x>sum)
        {
            sum = sum*10+x%10;
            x = x/10;
        }
        return (x==sum)||(x==sum/10);
    }
}
