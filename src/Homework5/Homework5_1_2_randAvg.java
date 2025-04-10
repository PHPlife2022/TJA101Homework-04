package Homework5;

import java.util.Arrays;

public class Homework5_1_2_randAvg {
	public static void main(String[] args) {
		System.out.println("取得本次亂數結果:");
		Homework5_1_2_randAvg randA = new Homework5_1_2_randAvg();
		randA.randAvg();
	}
	public void randAvg() {		
		int[] randomNumArray =new int[10];
		int sum = 0;
		int avg = 0;
		for(int i =0;i<randomNumArray.length;i++) {
			int randomNum = (int)(Math.random()*101);
			randomNumArray[i]=randomNum;
			sum += randomNum;
			avg = sum / 10;
		}
		System.out.println(Arrays.toString(randomNumArray));
//		System.out.println(sum);
		System.out.println(avg);
	}
}
