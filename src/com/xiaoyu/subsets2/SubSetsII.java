package com.xiaoyu.subsets2;

import java.util.*;

/**
 * Created by lhy on 17/6/3.
 */
public class SubSetsII {
    public static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[]args){
        result = new SubSetsII().subsetsWithDup(new int[]{1,4,4,4,4});
        for(int i=0;i<result.size();i++){
            System.out.print("[");
            for(int j=0;j<result.get(i).size();j++){
                System.out.print(result.get(i).get(j)+",");
            }
            System.out.print("]，");

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        result.clear();
//        result.add(new ArrayList<Integer>());
//        int visited[] = new int[nums.length];
//        int n = nums.length;
//        backtracking(0,n,visited,nums);
//        return result;

        Set<List<Integer>> result2 = new HashSet<List<Integer>>();
        List<Integer> empty = new ArrayList<Integer>();
        result2.add(empty);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            Set<List<Integer>> toAdd = new HashSet<List<Integer>>();
            for (List<Integer> list : result2) {
                List<Integer> newList = new ArrayList<Integer>(list);
                newList.add(nums[i]);
                toAdd.add(newList);
            }
            result2.addAll(toAdd);
        }
        return new ArrayList<List<Integer>>(result2);
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
        if(item.size()>0) {
            boolean flag = true;
            for(int k = 1;k<result.size();k++){
                if(result.get(k).size()==item.size()){
                    for(int m=0;m<item.size();m++){
                        if(item.get(m).intValue()!=result.get(k).get(m).intValue()){
                            break;
                        }else {
                            if (m==item.size()-1)
                                flag = false;
                        }
                    }
                }
                if(!flag)
                    break;
            }
            if(flag)
            result.add(item);
        }

        backtracking(i+1,n,visited,nums);
        visited[i] = 0;
        backtracking(i+1,n,visited,nums);
    }
}
