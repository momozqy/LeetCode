package com.xiaoyu.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoMo on 2017/6/4.
 */
public class Subsets {
    public static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[]args){
        new Subsets().subsets(new int[]{1,2,3});
        for(int i=0;i<result.size();i++) {
            List<Integer> list = result.get(i);
            System.out.print("[");
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j)+",");
            }
            System.out.println("],");
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        result.clear();
        result.add(new ArrayList<Integer>());
        int visited[] = new int[nums.length];
        int n = nums.length;
        backtracking(0,n,visited,nums);
        return result;
    }
    public void backtracking(int i,int n,int visited[],int[] nums){
        if(i>=n){
            return ;
        }
        visited[i] = 1;
        List<Integer> item = new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(visited[j]==1)
                item.add(nums[j]);
        }
        if(item.size()>0)
            result.add(item);

        backtracking(i+1,n,visited,nums);
        visited[i] = 0;
        backtracking(i+1,n,visited,nums);
    }
}
