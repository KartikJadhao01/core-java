package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DeQueueDemo{

	static void dque() {
		ArrayDeque q = new ArrayDeque();
		
		q.add(1);
		q.add("Kartik");
		
		System.out.println(q);
	}
	
	public static void main(String[] args) {
		dque();
	}
}
 	