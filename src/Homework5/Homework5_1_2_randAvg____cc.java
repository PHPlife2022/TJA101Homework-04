package Homework5;

import java.util.Arrays;
import java.util.Random;

public class Homework5_1_2_randAvg____cc {
	public static void main(String[] args) {
		System.out.println("取得本次亂數結果:");
		Homework5_1_2_randAvg____cc randA = new Homework5_1_2_randAvg____cc();
		randA.randAvg();
	}
	
	
	public void randAvg() {		
		int[] randomNumArray = new int[10];	
		double sum = 0;			
		for(int i =0;i<randomNumArray.length;i++) {
			int randomNum = (int)(Math.random()*101);
			System.out.print(randomNum+ " ");			
			randomNumArray[i]=randomNum;
			sum += randomNum;					
		}
		System.out.println();
		double avg = sum / randomNumArray.length;
		
		//方法2
//		Random ran = new Random();//		
//		int[] randomNumArray =ran.ints(10,0,100).toArray();
//		Arrays.stream(randomNumArray).forEach(num -> System.out.print(num + " ")); 
//		參數 分隔 操作
//		System.out.println();		
		//取總和、平均
//		double sum = 0;	
//		for (int ssNum : randomNumArray) {   //資料型別、變數名稱 : 集合、陣列
//		    sum += ssNum;		    
//		}				
//		double avg = sum / randomNumArray.length;


		//亂數平均
//		double avg = ran.ints(10,0,100).average()
//				.getAsDouble();//
		
		System.out.println(avg);
	}
}
