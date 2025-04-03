package Homework4;

import java.util.Arrays;
public class Homework4_1_2_reverseWord {
	public static void main(String[] args) {
		String w = "HelloWorld";
		String[] spW = w.split("");			
		System.out.println(Arrays.toString(spW));
		
		int i ;		
		String[] reW = new String[spW.length];
		
		for(i=0;i<=spW.length- 1;i++) {					
			reW[i]=spW[spW.length - 1 - i];					
		}
		System.out.println(Arrays.toString(reW));
	}
};
