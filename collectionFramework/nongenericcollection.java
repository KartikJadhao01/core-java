package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class nongenericcollection {
public static void main(String[] args) {
	
	
	//Non-Generic Collections
	List studentdata = new ArrayList();
	studentdata.add(10);
	studentdata.add("Jiya");
	studentdata.add(70.5);
	studentdata.add('A');
	
	System.out.println("Student Data Arraylist is: " + studentdata);
	System.out.println("Contains: " + studentdata.contains(10));
	studentdata.addFirst('@');
	System.out.println("After add first Studentdata ArrayList is: " + studentdata);
	studentdata.addLast('%');
	System.out.println("After add Last Studentdata ArrayList is: " + studentdata);
	System.out.println(studentdata.remove(0));
	System.out.println("Removing First Element: " + studentdata.removeFirst());
	System.out.println("Removing Last Element: " + studentdata.removeLast());
	
	System.out.println("Size: " +  studentdata.size());
	
	System.out.println("Element on Index: " + studentdata.get(0));
			
	System.out.println("Element on First Index: " + studentdata.getFirst());
	System.out.println("Element on Last Index: " + studentdata.getLast());
	
}
}
