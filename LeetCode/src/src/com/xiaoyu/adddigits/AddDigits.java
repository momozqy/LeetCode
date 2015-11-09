package src.com.xiaoyu.adddigits;

import java.util.Scanner;

public class AddDigits {

	 public int addDigits(int num) {
		 if(num<10)
			 return num;
		 int x = num%10;
		 int sum = x+addDigits(num/10);
		 while(sum>=10){
			 sum  = addDigits(sum);
		 }
		 return sum;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int num = cin.nextInt();
			System.out.println(new AddDigits().addDigits(num));
		}
	}

}
