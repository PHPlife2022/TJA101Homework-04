package Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1_triangle {
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
		
	}
}
