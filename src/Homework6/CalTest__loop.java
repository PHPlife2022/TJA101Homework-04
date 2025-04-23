package Homework6;

import java.util.Scanner;

public class CalTest__loop extends Calculator  {
	public static void main(String[] args) {
		while(true){
			try {			
				CalTest__loop c = new CalTest__loop();				
				System.out.println("請輸入X的值:" );
				int x = getInput();			
						
				System.out.println("請輸入Y的值:" );
				int y = getInput();
			
				System.out.println(x + "的"+ y + "次方為" + c.powerXY(x,y));
				break;
			}catch(CalException a){
				System.out.println("錯誤訊息:"+ a.getMessage());
		}}		
	}
	public static int getInput() throws CalException{
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				return sc.nextInt();
			}catch(Exception a) {
//				throw new CalException("輸入格式不正確");
				System.out.println("輸入格式不正確,請重新輸入");
				sc.nextLine();  //用來清除訊息
			}
		}
		
	}
}
