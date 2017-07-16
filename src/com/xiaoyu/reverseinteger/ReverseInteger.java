package com.xiaoyu.reverseinteger;

/**
 * Created by momo on 2017/7/16.
 */
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(new ReverseInteger().reverse2(-2147483647));
    }
    public int reverse(int x) {
        int flag = 1;

        if(x<0){
            flag = -1;
            x  = -x;
        }
        if(x==Integer.MIN_VALUE){
            flag = -1;
            x  = Integer.MAX_VALUE;
        }
        String MAX = Integer.MAX_VALUE + "";
        String str = x + "";
        String result = "";

        for(int i = str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        Double num1 = new Double(MAX);
        Double num2 = new Double(result);
        if(num2>num1){
            return 0;
        }
        return flag* Integer.parseInt(result);
    }

    public int reverse2(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
}
