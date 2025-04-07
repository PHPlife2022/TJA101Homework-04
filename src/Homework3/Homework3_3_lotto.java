package Homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Homework3_3_lotto {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入討厭的數字:");
		int lotS = sc.nextInt();
		int r;
		int count = 0;
		for (r = 1; r <= 49; r++) {
			if (r % 10 == lotS) {
				continue;
			} else if (r / 10 == lotS) {
				continue;
			}
			System.out.print(r + " ");
			count++;
		}
		;
		System.out.println("");
		System.out.println("總共有" + count + "個數字可選");
		System.out.println("以下是電腦選號:");
		int[] lot = new int[6];
		int arrayN = 0;
		while (arrayN < 6) {
			lot[arrayN] = (int) (Math.random() * 49) + 1;
			if (lot[arrayN] % 10 == lotS) {
				continue;
			} else if (lot[arrayN] / 10 == lotS) {
				continue;
			}
			System.out.print(lot[arrayN] + " ");
			arrayN++;
		}
		;
	}
	
};
