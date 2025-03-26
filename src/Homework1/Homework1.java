package Homework1;

public class Homework1 {
	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println("=============");
		int egg = 200;
		int dorzon = egg / 12;
		System.out.println("總共"+ dorzon + "打"+(egg % 12)+"顆");
		System.out.println("=============");
		int time = 256559;
		int min = time / 60;
		int hour = min / 60;
		int day = hour / 24;
		System.out.println("總共"+day+"天"+(hour % 24)+"小時"+(min % 60)+"分鐘"+(time % 60)+"秒");
		System.out.println("=============");
		final float pi = 3.1415f;
		int r = 5;
		float Area = pi * r * r;
		float circum = 2 * pi * r;
		System.out.println("圓面積為"+Area+",圓周長為"+circum);
		System.out.println("=============");
		int originG = 1_500_000;
		double rent = 1.02d;
		int year = 10;
		double rentTen = Math.pow(rent, year);
		double total = originG *  rentTen;
		System.out.println("共有"+total+"元");
		System.out.println("=============");
		System.out.println(5+5); //整數與整數相加
		System.out.println(5+'5'); // 整數與字元相加,字元於編碼表中搜尋後相加
		System.out.println(5+"5"); //整數與string相加,自動轉為string 故連接起來
	}	
}
