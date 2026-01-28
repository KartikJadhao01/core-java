package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class generic_collection {
public static void main(String[] args) throws InterruptedException {
	ArrayList <String> names = new ArrayList <String>();
	names.add("Kartik");
	names.add("Vishal");
	names.add("Aditya");
	
	
	Iterator itr = names.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()); //it iterates the element one by one
		
//		Thread.sleep(2000);
	}
}
}
