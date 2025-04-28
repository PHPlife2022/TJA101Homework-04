package Homework8;

import java.util.*;

public class hw8_2_1_set {
	public static void main(String[] args) {
		Set<train> set = new HashSet<train>();
		set.add(new train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new train(1254, "區間", "屏東", "基隆", 700));
		set.add(new train (118, "自強", "高雄", "台北", 500));
		set.add(new train(1288, "區間", "新竹", "基隆", 400));
		set.add(new train (122, "自強", "台中", "花蓮", 600));
		set.add(new train (1222, "區間", "樹林", "七堵", 300));
		set.add(new train (1254, "區間", "屏東", "基隆", 700));
		
//		Iterator iset = set.iterator();
//		while(iset.hasNext()) {
//			System.out.println(iset.next());
//		}
		
		List<train> liset = new ArrayList<>(set);
		for(int i = 0;i<liset.size();i++) {
			train t = liset.get(i);
			System.out.println(t);
		}
		
//		for(train iset:set) {
//			System.out.println(iset);
//		}
		
		
	}
	
	
}
