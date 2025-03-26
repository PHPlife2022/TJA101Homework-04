package Homework2;

public class Homework2 {
	public static void main(String[] args) {
		System.out.println("Q1==========");
		int i = 1;
		int sumplus = 0;
		for (i = 2; i <= 1000; i = i + 2) {
			sumplus += i;
		}
		System.out.println(sumplus);
		System.out.println("Q2==========");
		int i2 = 1;
		int sumX = 1;
		for (i2 = 1; i2 <= 10; i2++) {
			sumX *= i2;
		}
		System.out.println(sumX);
		System.out.println("Q3==========");
		int i3 = 1;
		int sumX2 = 1;
		while (i3 <= 10) {
			sumX2 *= i3;
			i3++;
		}
		System.out.println(sumX2);
		System.out.println("Q4==========");
		int i4 = 1;
		int j4 = 1;
		for (i4 = 1; i4 <= 10; i4++) {
			j4 = i4 * i4;
			System.out.print(j4 + "\t");
		}
		System.out.println();
		System.out.println("Q5==========");
		int i5 = 1;
		int count = 0;
		for (i5 = 1; i5 <= 49; i5++) {
			if (i5 % 10 == 4) {
				continue;
			}else if(i5 / 10 == 4) {
				continue;
			}
			System.out.print(i5 + "\t");
			count++;			
		}		
		System.out.println();
		System.out.println("總數為"+count);
		System.out.println("Q6==========");
		int i6 = 1;
		int j6 = 1;
		for (i6 = 10;i6>=1 ;i6--) {
			for (j6 =1; j6 <= i6; j6++) {
				System.out.print(j6+"\t");
			}
			System.out.println();
		}
		System.out.println("Q7==========");
		int i7 = 1;
		int j7 = 1;
		for (i7=1;i7<=6;i7++) {
			for(j7=1;j7<=i7;j7++)
				System.out.print(j7+"\t");
			System.out.println();
		}
	}
}