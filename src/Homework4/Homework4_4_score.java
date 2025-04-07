package Homework4;

import java.util.Arrays;

public class Homework4_4_score {
	public static void main(String[] args) {
		int[][] grade = { { 100, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
//		取出每次考試最高分-->?
//		g[i][r]哪個r最高 怎麼比較 
//		設最大值
//		計數
		
		int[] studentCount = new int[grade[0].length]; //計最高分同學次數
		
		for (int i = 0; i < grade.length; i++)  
		{
			int max = grade[i][0];
			for (int r = 0; r < grade[i].length; r++) //取最高分
			{
				if (grade[i][r] > max) 
				{
					max = grade[i][r];					
				}				
			}
			for(int e = 0;e < grade[i].length;e++) {    //計數(包含同分)
				if(grade[i][e] == max) 
				{
					studentCount[e]++;
				}
			}
		}	
		System.out.println(Arrays.toString(studentCount));
		for(int i = 0;i<studentCount.length;i++) {
			System.out.println((i+1)+"號同學考最高分次數為"+studentCount[i]+"次");
		}
	}
}
