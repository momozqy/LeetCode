package com.xiaoyu.validparentheses;

import java.util.Stack;

/**
 * Created by momo on 2017/7/20.
 */
public class ValidParentheses {
    public static void main(String[] args){
        System.out.println(new ValidParentheses().isValid("{[({[}})]}[)"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                char pop = stack.pop();
                char dd = s.charAt(i);
                if((dd-pop)!=1&&dd-pop!=2)
                    return false;
            }
        }
        if(stack.size()!=0)
            return false;
        return true;
    }
}
