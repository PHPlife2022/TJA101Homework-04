package Homework5;

import java.util.Random;

public class Homework5_4_genAuthCode {
	public String genAutnCode(int length) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char [] arrCode = new char[length]; 
		for(int i=0;i<arrCode.length;i++) {
			arrCode[i]= str.charAt(new Random().nextInt(str.length()));
		}		
		String Code = new String(arrCode);
		return Code;
	}
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:");
		Homework5_4_genAuthCode test = new Homework5_4_genAuthCode();
		System.out.println(test.genAutnCode(18));
	}
}
