package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4_3_date {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int[][] date = {{sc.nextInt(),sc.nextInt(),sc.nextInt()},{31,28,31,30,31,30,31,31,30,31,30,31}};
		
		int year = date[0][0];
		int mon= date[0][1];
		int day = date[0][2];
		
		if (day != date[1][mon]) {
			System.out.println("日期輸入錯誤");
		}
		else 
		{
			int sum = 0;
			if((year % 4==0 && year % 100 != 0)||(year % 400 ==0)){
				date [1][1] = 29;			
			}
			for(int i =0;i<mon-1;i++) {
				sum += date[1][i];
			}
			sum += day;
			System.out.println("輸入的日期為該年第"+sum+"天");
		}
		
		
}}
