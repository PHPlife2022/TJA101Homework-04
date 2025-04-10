package Homework5;

public class Homework5_2_overloading {
	public int maxElement(int x[][]) {
		int max = x[0][0];
		for(int i =0;i<x.length;i++) {
			for(int r=0;r<x[i].length;r++) {
				if(max <= x[i][r]) {
					max = x[i][r];
				}
			}
		}
		return max;
	}
	public double maxElement(double x[][]) {
		double max = x[0][0];
		for(int i =0;i<x.length;i++) {
			for(int r=0;r<x[i].length;r++) {
				if(max < x[i][r]) {
					max = x[i][r];
				}
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int[][] intArray = {
				{1,6,3},{9,5,2}
		};
		double[][] doubleArray = {
				{1.2,3.5,2.2},{7.4,2.1,8.2}
		};
		Homework5_2_overloading w = new Homework5_2_overloading();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}
	
}

