package Homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入:");
		int[] i = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

		Arrays.sort(i);
		if (i[0] == 0 || i[1] == 0 || i[2] == 0 || i[0] + i[1] <= i[2]) {
			System.out.println("不是三角形");
		} else if (i[0] == i[1] && i[0] == i[2]) {
			System.out.println("正三角形");
		} else if (i[0] == i[1] || i[1] == i[2]) {
			System.out.println("等腰三角形");
		} else if (i[0] * i[0] + i[1] * i[1] == i[2] * i[2]) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		};
		Scanner g1 = new Scanner(System.in);
		System.out.println("開始猜數字吧!(0~9)");
		int num = (int) (Math.random() * 9);
		for (;;) {

			int g2 = g1.nextInt();
			if (g2 == num) {
				System.out.println("猜對了!答案就是" + num);
				break;
			} else {
				System.out.println("猜錯了~");
			}
		}
		System.out.println("開始猜數字吧!(0~100)");
		int num2 = (int) (Math.random() * 100);
		for (;;) {
			int g3 = g1.nextInt();
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
		Scanner h = new Scanner(System.in);
		System.out.println("請輸入討厭的數字:");
		int h1 = h.nextInt();
		int r;
		int count = 0;
		for (r = 1; r <= 49; r++) {
			if (r % 10 == h1) {
				continue;
			} else if (r / 10 == h1) {
				continue;
			}
			System.out.print(r + " ");
			count++;
		}
		;
		System.out.println("");
		System.out.println("總共有" + count + "個數字可選");
		int[] lot = new int[6];
		int arrayN = 0;
		while (arrayN < 6) {
			lot[arrayN] = (int) (Math.random() * 49) + 1;
			if (lot[arrayN] % 10 == h1) {
				continue;
			} else if (lot[arrayN] / 10 == h1) {
				continue;
			}
			System.out.print(lot[arrayN] + " ");
			arrayN++;
		}
		;
	}
};
