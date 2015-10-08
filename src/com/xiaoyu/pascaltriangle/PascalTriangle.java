package com.xiaoyu.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

/*
 * Êä³öÑî»ÔÈı½Ç
 */
public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (numRows != 0) {
			List<Integer> l = new ArrayList<Integer>();
			l.add(1);
			int s = 1;
			list.add(l);
			System.out.println(1);
			for (int i = 2; i <= numRows; s = 1, i++) {
				l.clear();
				l.add(1);
				for (int j = 1; j <= i - 2; j++) {
					s = (i - j) * s / j;
					l.add(s);
				}
				l.add(1);
				list.add(l);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		new PascalTriangle().generate(2);
	}
}
