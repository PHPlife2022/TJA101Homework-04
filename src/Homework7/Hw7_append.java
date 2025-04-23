package Homework7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Hw7_append {
	public static void main(String[] args) {
		Random rand = new Random();
		
		try(FileWriter fw = new FileWriter("Data.txt",true)){
			fw.write("亂數:");
			for(int i =0;i<10;i++) {
				int randNum = rand.nextInt(1000);
				fw.write(randNum + (i<9 ? "," : ""));
			}			
			fw.write("\n");
		}catch(IOException e) {
			System.out.println("fail");
		}		
	}
	public static void copyFile(String a , String b) {
		try(
				BufferedReader br = new BufferedReader(new FileReader(a));
				BufferedWriter bw = new BufferedWriter(new FileWriter(b))
		)
		{
//			int c;
//			while ((c = br.read()) != -1) { 
//				bw.write(c);
////				System.out.print((char) c);
////				System.out.flush();
//			}
			String l;
			while((l=br.readLine()) != null) {
				bw.write(l);
				bw.newLine();
			}
			
		}catch(IOException e) {
			System.out.println("fail");
		}
	}
}
