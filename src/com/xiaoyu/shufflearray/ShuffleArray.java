package com.xiaoyu.shufflearray;

import java.util.Random;

/**
 * Created by lhy on 17/6/6.
 */
public class ShuffleArray {
    private static int[] reset;
    ShuffleArray(int[] nums){
        reset = nums;
    }
    public static void main(String[]args){
        ShuffleArray shuff = new ShuffleArray(new int[]{1,2,3});
        int[] res = shuff.shuffle();
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+",");
        }
        res = new ShuffleArray(new int[]{1,2,3}).reset();
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i]+",");
        }
    }
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
//        for(int i = 0;i<reset.length;i++){
//            saved[i] = reset[i];
//        }
        return reset;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        int[] saved = new int[reset.length];
        for(int j = 0;j<reset.length;j++){
            saved[j] = reset[j];
        }
        for(int i = 0;i < saved.length;i++) {
            int index = random.nextInt(saved.length);
            int t  = saved[i];
            saved[i] = saved[index];
            saved[index] = t;
        }
        return saved;
    }
}
