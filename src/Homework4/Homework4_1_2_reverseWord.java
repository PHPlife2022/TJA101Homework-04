package Homework4;

import java.util.Arrays;
public class Homework4_1_2_reverseWord {
	public static void main(String[] args) {
		String w = "Hello World!";
		
		String[] spWA = w.split("");			
		System.out.println(Arrays.toString(spWA));
		
		int i ;		
		String[] reWA = new String[spWA.length];		
		for(i=0;i<=spWA.length- 1;i++) {					
			reWA[i]=spWA[spWA.length - 1 - i];					
		}
		System.out.println(Arrays.toString(reWA));
		
		String reW = String.join("",reWA);		
		System.out.print(w + "-->");
		System.out.println(reW);
	}
};
