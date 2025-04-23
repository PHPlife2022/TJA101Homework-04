package Homework7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class read_object {
	public static void main(String[] args) throws ClassNotFoundException {
		try(ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("C:\\data\\Object.ser"))){
			for(int i = 0;i<4;i++) {
				speakable dc = (speakable)ois.readObject();			
				dc.speak();
			}		
		}
		catch(IOException e) {
					System.out.println("fail");
					 e.printStackTrace();
				}
	}
}
