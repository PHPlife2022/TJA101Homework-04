package Homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Homework3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入:");
//		int data = sc.nextInt();
//		System.out.println(data + 100);
//	}
//	1.建陣列
	public static void main(String[] args) {				
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入:");	
		int[] i = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
				
		Arrays.sort(i);
		if( i[0]== 0 || i[1] == 0 || i[2] == 0 || i[0]+i[1]<=i[2]) {
			System.out.println("不是三角形");
		}
		else if(i[0] == i[1] && i[0] == i[2]) {
			System.out.println("正三角形");		
		}else if(i[0] == i[1] || i[1] == i[2]) {
			System.out.println("等腰三角形");
		}else if (i[0]*i[0]+i[1]*i[1]==i[2]*i[2]){
			System.out.println("直角三角形");
		}else 
		{System.out.println("其他三角形");};
		
		
		Scanner g1 = new Scanner(System.in);
		System.out.println("開始猜數字吧!");	
		int g2 = g1.nextInt();
		int num = (int)Math.random() * 10;
		switch("g2") {
		case "num":
			System.out.println("猜對瞜");
			break;
//		case !"num"	:
		}
};
//	1.建陣列
//	2.scanner	
//	3.判斷
//	三個數字一樣
//	兩個數字一樣
//	兩邊平方等於第三邊平方?????
//	其他
//	有0


//	==3-2

//	1.產生亂數
//	2.無窮迴圈猜對break	
//	3.印
//	3-2-2
//	1.if else > <
//	
//			
			
//	==3-3
////	1.挑掉數字的方法
////	2.輸入數字
////	3.輸入後,亂數六個號碼不能重複
////	4.印出來
	
}
