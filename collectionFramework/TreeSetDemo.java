package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	static void ng() {
		//TreeSet do not support non-Generic collection as it is sorted set
		
		//Que. Difference btw compa
		//Que. Difference btw next hasnext
	}
	
	static void gen() {
TreeSet <Integer> nums = new TreeSet <Integer>();
		
		nums.add(45);
		nums.add(85);
		nums.add(35);
		
		System.out.println("TreeSet is: " + nums);
		System.out.println("Reverse: " + nums.reversed());
//		System.out.println();
		
		Iterator itr = nums.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ->");
		}
	}
	
	public static void main(String[] args) {
		gen();
	}
}
