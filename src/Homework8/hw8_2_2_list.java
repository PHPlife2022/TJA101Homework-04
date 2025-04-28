package Homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class hw8_2_2_list {
	public static void main(String[] args) {
		List<train> t = new ArrayList<train>();
		t.add(new train(202, "普悠瑪", "樹林", "花蓮", 400));
		t.add(new train(1254, "區間", "屏東", "基隆", 700));
		t.add(new train (118, "自強", "高雄", "台北", 500));
		t.add(new train(1288, "區間", "新竹", "基隆", 400));
		t.add(new train (122, "自強", "台中", "花蓮", 600));
		t.add(new train (1222, "區間", "樹林", "七堵", 300));
		t.add(new train (1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(t);
		
//		Iterator it = t.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
//		for(train it : t) {
//			System.out.println(it);
//		}
		
		train pt;
		for(int i = 0;i<t.size();i++) {
			pt = t.get(i);
			System.out.println(pt);
		}
		
		}
}
