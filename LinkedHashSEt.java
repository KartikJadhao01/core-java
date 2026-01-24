package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSEt {

	public static void main(String[] args) {
		ng();
	}
	
	static void ng() {
		LinkedHashSet inst_details = new LinkedHashSet();
		
		inst_details.add("FCt");
		inst_details.add(100);
		inst_details.add('F');
		inst_details.add(4);
		
		System.out.println(inst_details);
		
LinkedHashSet clg_details = new LinkedHashSet();
		
		clg_details.add("FC");
		clg_details.add(1000);
		clg_details.add('C');
		clg_details.add(12);
		
		for (Object ins : clg_details) {
			System.out.println(clg_details);
		}
		
		
		
		inst_details.addAll(clg_details);
		System.out.println("After addAll: " + inst_details);
	}
}
