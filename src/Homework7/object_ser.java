package Homework7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class object_ser {
	public static void main(String[] args) {
		 File f = new File("C:\\data");
		 if(!f.exists()) {
			 f.mkdirs();
		 }
		 Dog a = new Dog("Mike");
		 Dog b = new Dog("Bebe");
		 Cat c = new Cat("Lufy");
		 Cat d = new Cat("john");
		 try(
				 ObjectOutputStream oops = new ObjectOutputStream(
				 new FileOutputStream("C:\\data\\Object.ser"))){
			 oops.writeObject(a);
			 oops.writeObject(b);
			 oops.writeObject(c);
			 oops.writeObject(d);
		 }
		 catch(IOException e) {
			 System.out.println("fail");
		 }
	}
}
