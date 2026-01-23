package task;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Demo {
	void linked() {
		LinkedList data = new LinkedList();
		
		data.add(1);
		data.add("Kartik");
		data.add("Kartik");
		
		System.out.println("Data LinkedList is: " + data);
		
		System.out.println("Contains: " + data.contains(10));
		
		data.addFirst('@');
		System.out.println("After add first data LinkedList is: " + data);
		
		data.addLast('%');
		System.out.println("After add Last data LinkedList is: " + data);
		
		System.out.println(data.remove(0));
		
		System.out.println("Removing First Element: " + data.removeFirst());
		
		System.out.println("Removing Last Element: " + data.removeLast());
		
		System.out.println("Size: " +  data.size());
		
		System.out.println("Element on Index: " + data.get(0));
				
		System.out.println("Element on First Index: " + data.getFirst());
		
		System.out.println("Element on Last Index: " + data.getLast());
		
		System.out.println("Peek: " + data.peek());
		
		System.out.println("Element: " + data.element());
		
		data.offer(45);
		System.out.println("Offer" + data);
	}
	
public static void main(String[] args) {
	LinkedList_Demo li = new LinkedList_Demo();
	li.linked();
}
}
