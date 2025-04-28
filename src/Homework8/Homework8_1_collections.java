package Homework8;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8_1_collections {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add((short)100);
		list.add(5.1);
		list.add("kitty");
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		list.add(new Object());
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object itn = it.next();
			System.out.println(itn);			
			if(!(itn instanceof Number)) {
				it.remove();				
			}			
		}
		System.out.println("-----");
		System.out.println("刪除後結果:");
		for(Object itr : list) {
			System.out.println(itr);
		}
//		for(int i =0;i<list.size();i++) {
//			Object oit = list.get(i);
//			System.out.println(oit);
//		}
//		for(Object fit : list) {
//			System.out.println(fit);		
//		}
//		
	}
}
