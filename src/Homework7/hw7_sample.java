package Homework7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class hw7_sample {
	public static void main(String[] args) {
		//算字元
		
		int total = 0;
		try(BufferedReader br = new BufferedReader(new FileReader("Sample.txt")))
		{
			int c;			
			while((c=br.read()) != -1) 
				total ++;		
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//算位元組
		int totalb = 0;
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Sample.txt")))
		{			
			int b;			
			while((b=bis.read())!= -1) 
				totalb ++;				
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
		//readLine 算列
		int totalL = 0;
		try(BufferedReader brL = new BufferedReader(new FileReader("Sample.txt")))
		{
		String s;		
		while((s=brL.readLine()) != null) 
			totalL ++;		
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Sample.txt檔案共有"+ totalb+ "個位元組，"+ total+"個字元，"+totalL+"列資料");
	}
}
