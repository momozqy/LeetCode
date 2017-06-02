package com.xiaoyu.ikjpattern;

public class IKJPattern {

	public static void main(String[] args) {
		System.out.println(new IKJPattern().find132pattern(new int[] { 8, 10, 4, 6, 5 }));
	}

	public boolean find132pattern(int[] nums) {
		int len = nums.length;
		if (len <= 2)
			return false;
		int i, j, k, a = 0, b, c;
		while (a < len) {
			while (a < len - 1 && nums[a] >= nums[a + 1])
				a++;
			b = a + 1;
			while (b < len - 1 && nums[b] <= nums[b + 1])
				b++;
			c = b + 1;
			while (c < len) {
				if (nums[c] > nums[a] && nums[c] < nums[b])
					return true;
				c++;
			}
			a = b + 1;
		}
		return false;
	}
}
