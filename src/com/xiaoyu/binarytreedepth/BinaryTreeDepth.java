package com.xiaoyu.binarytreedepth;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BinaryTreeDepth {
	public int removeDuplicates(int[] nums) {
		if (nums == null)
			return 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++)
			set.add(nums[i]);
		int[] nums2 = new int[set.size()];
		int o = 0;
		Iterator<Integer> it = set.iterator();
		int index = 0;
		while (it.hasNext()) {
			o = it.next();
			nums2[index++] = o;
		}
		nums = nums2;
		return set.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new BinaryTreeDepth().removeDuplicates(new int[] {
				1, 1, 1, 2, 2, 2, 2, 4, 4, 4 }));
	}
}
