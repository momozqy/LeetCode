package com.xiaoyu.symmetrictree;

/**
 * Created by momo on 2017/7/31.
 */
public class SymmetricTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[]args){
        TreeNode root = new TreeNode(1);
    }
    public boolean isSymmetric(TreeNode root) {
        return travelTree(root,root);
    }
    public boolean travelTree(TreeNode leftroot,TreeNode rightroot){
        if(leftroot==null&&rightroot==null)return true;
        if(leftroot==null||rightroot==null) return false;
        return (leftroot.val==rightroot.val)&&travelTree(leftroot.left,rightroot.right)&&travelTree(leftroot.right,rightroot.left);
    }
}
