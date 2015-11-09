package com.xiaoyu.numberbits;

import java.util.HashSet;
import java.util.Set;

public class NumberBits {
	public int hammingWeight(int n) {
		int count = 0;
		System.out.println(n);
		while (n > 0) {
			if (n % 2 != 0)
				count++;
			n = n / 2;
		}
		return count;
	}

	public boolean containsDuplicate(int[] nums) {
		Set set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			set.add(new Integer(nums[i]));
		}
		if (nums.length == set.size())
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		System.out.println(new NumberBits().containsDuplicate(new int[] { 0 }));
	}
}
