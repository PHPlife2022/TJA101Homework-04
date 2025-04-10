package Homework5;


import java.util.Scanner;

public class Homework5_1_1_square {	
	public static void main(String[] args) {
		System.out.println("請輸入寬與高:");
		Scanner sc = new Scanner(System.in);
		Homework5_1_1_square s = new Homework5_1_1_square();		
		s.starSquare(sc.nextInt(),sc.nextInt());
	}
	public void starSquare(int width, int height) {					
		for(int i = 0;i<height;i++) {
			for(int r = 0;r<width;r++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}	
}