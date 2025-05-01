package Homework9;

import java.util.concurrent.ThreadLocalRandom;

public class BigEater implements Runnable {
	int count = 0;
	String name;
	public BigEater(String name) {
		this.name = name;
	}
	public BigEater() {		
	}
	public void run() {
		while(count < 10) {
			count++;
			System.out.println( name + "吃第"+count+"碗飯");
			int randonNum = ThreadLocalRandom.current().nextInt(500,3000);
			try {
				if(count == 10) {
					System.out.println(name+"吃完了");					
				Thread.sleep(randonNum);				
				}
			}catch(Exception e){				
			}			
		}	
	}
	
	public static void main(String[] args) {
		BigEater james = new BigEater("詹姆士ooooooo");
		BigEater moon = new BigEater("饅頭人");
		Thread jamesT = new Thread(james);
		Thread moonT = new Thread(moon);
		jamesT.start();
		moonT.start();	
		try {
			jamesT.join();
			moonT.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("比賽結束");
	}
}
