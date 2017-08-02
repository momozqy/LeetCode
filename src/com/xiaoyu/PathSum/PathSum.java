package com.xiaoyu.PathSum;

/**
 * Created by momo on 2017/8/2.
 */
public class PathSum {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[]args){
         TreeNode root = new TreeNode(-2);
         root.left = null;
         root.right = new TreeNode(-3);
         System.out.println(new PathSum().hasPathSum(root,-5));
    }
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null||root.val>sum) return false;
        helper(root,0,sum);
        return flag;
    }
    public int helper(TreeNode node,int s,int sum){
        if(node==null||s+node.val>sum) return s;
        s += node.val;
        if(node.left==null&&node.right==null&&s==sum) {flag = true;return s;}
        if(!flag) helper(node.left,s,sum);
        if(!flag) helper(node.right,s,sum);
        return s;
    }
}
