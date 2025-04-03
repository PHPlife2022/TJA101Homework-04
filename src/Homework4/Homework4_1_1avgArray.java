package Homework4;

public class Homework4_1_1avgArray {	
	public static void main(String[] args) {
		System.out.println("請輸出此陣列所有元素的平均值與大於平均值的元素:");
		int[] Arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0 ;		
		for(int i=0;i<Arr.length;i++) {
			sum += Arr[i];			
		}
		int avg = sum / Arr.length;
		System.out.println("平均值="+ avg);
		System.out.print("大於平均值:");
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]>avg) {
				System.out.print(Arr[i]+ " " );
			}
		}		
					
	}
};
