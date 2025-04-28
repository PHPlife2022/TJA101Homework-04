package Homework8;

import java.util.*;

public class hw8_2_3_treeset {
	public static void main(String[] args) {
		Set trset = new TreeSet();
		trset.add(new train(202, "普悠瑪", "樹林", "花蓮", 400));
		trset.add(new train(1254, "區間", "屏東", "基隆", 700));
		trset.add(new train (118, "自強", "高雄", "台北", 500));
		trset.add(new train(1288, "區間", "新竹", "基隆", 400));
		trset.add(new train (122, "自強", "台中", "花蓮", 600));
		trset.add(new train (1222, "區間", "樹林", "七堵", 300));
		trset.add(new train (1254, "區間", "屏東", "基隆", 700));
		
		Iterator itrset = trset.iterator();
		while(itrset.hasNext()) {
			System.out.println(itrset.next());
		}
	}
}
