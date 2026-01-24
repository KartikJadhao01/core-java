package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	static void non_gen() {
		//1.By using interface name
		//Set hs = new HashSet();
		
		//OR
		
		//2.By using classname
		HashSet hs2 = new HashSet();
		hs2.add(1000);
		hs2.add("KArtik");
	}
	
	static void gen() {
		HashSet <Float> marks = new HashSet <Float>();
		marks.add(83.45f);
		marks.add(46.45f);
		marks.add(459.95f);
		
		Iterator itr = marks.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		marks.add(45.2f);
		System.out.println(marks);
		System.out.println("Contains: " + marks.contains(46.45));
		marks.remove(46.45f);
		System.out.println(marks);
		
		
	}
	
	public static void main(String[] args) {
		non_gen();
		gen();
	}
}
