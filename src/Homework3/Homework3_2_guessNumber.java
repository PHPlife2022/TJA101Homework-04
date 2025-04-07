package Homework3;

import java.util.Scanner;

public class Homework3_2_guessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!(0~9)");
		int num = (int) (Math.random() * 9);
		for (;;) {
			int g1 = sc.nextInt();
			if (g1 == num) {
				System.out.println("猜對了!答案就是" + num);
				break;
			} else {
				System.out.println("猜錯了~");
			}
		}
		
		
		System.out.println("開始猜數字吧!(0~100)");
		int num2 = (int) (Math.random() * 100);
		for (;;) {
			int g3 = sc.nextInt();
			if (g3 == num2) {
				System.out.println("猜對了!答案就是" + num2);
				break;
			} else if (g3 < num2) {
				System.out.println("猜錯了~太小了!!");
			} else {
				System.out.println("猜錯了~~太大了!");
			}
			;
		}
	}
}
