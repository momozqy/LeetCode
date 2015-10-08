package com.xiaoyu.movezero;

public class movezero {

	public void moveZeroes(int[] nums) {
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (index < 0 || index > i)
					index = i;
			} else {
				if (index >= 0) {
					nums[index] = nums[i];
					nums[i] = 0;
					index++;
				}
			}
		}

	}

	public static void main(String[] args) {
		new movezero().moveZeroes(new int[] { 0, 1, 3, 0, 12 });
	}
}
