package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_Gen {
public static void main(String[] args) {
	LinkedList <Character> vowels = new LinkedList <Character>();
	
	vowels.add('a');
	vowels.add('e');
	vowels.add('i');
	vowels.add('o');
	vowels.add('u');
	
	Iterator itr = vowels.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
