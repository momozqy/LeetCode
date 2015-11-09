package com.xiaoyu.romantonum;

public class Roman {
	char c[] = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	int n[] = { 1, 5, 10, 50, 100, 500, 1000 };

	public int change(char a) {
		if (a == c[0])
			return 1;
		if (a == c[1])
			return 5;
		if (a == c[2])
			return 10;
		if (a == c[3])
			return 50;
		if (a == c[4])
			return 100;
		if (a == c[5])
			return 500;
		return 1000;
	}

	public int romanToInt(String s) {

		boolean b[] = { true, true, true, true, true, true, true };
		int sum = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			char temp = s.charAt(i);
			int num = change(temp);
			boolean flag = true;
			for (int j = 0; j < 7; j++) {
				if (b[j] && num > n[j]) {
					b[j] = false;
					continue;
				}
				if (b[j] && num == n[j]) {
					sum += num;
					break;
				}
				if (!b[j] && num == n[j]) {
					sum -= num;
					break;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new Roman().romanToInt("MCMXCVI"));
	}
}
