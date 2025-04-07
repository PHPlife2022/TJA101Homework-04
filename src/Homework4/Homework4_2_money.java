package Homework4;

import java.util.Scanner;

public class Homework4_2_money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		System.out.println("欲借的金額:");
		int money = sc.nextInt();
		int[][] co = {{25,32,8,19,27},{2500,800,500,1000,1200}};
		int sum = 0;
		System.out.print("有錢可借的員工編號:");
		for(int i = 0;i<co[1].length;i++) {			
			if(co[1][i]>=money) {								
				System.out.print(co[0][i]+" ");
				sum++;
			}		
				
		}
		System.out.println("共"+sum+"人");
		
	}
	
};
