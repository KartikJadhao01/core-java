package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class flower {

	static void flw() {
		
//		
//		flowers.add("Lotus");
//		flowers.add("Rose");
//		flowers.add("Lilly");
//		flowers.add("Mogra");
//		flowers.add("Jasmine");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many flowers do you want to store? ");
		int size = sc.nextInt();
		HashSet <String> flowers = new HashSet <String>();
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter Flower name " + 1);
			String f = sc.next();	
			flowers.add(f);
		}
		
		System.out.println(flowers);
		
		System.out.println("Which flower to remove: ");
		String name = sc.next();
		
		Iterator itr = flowers.iterator();
		while(itr.hasNext()) {
			Object f = itr.next();
			if(name.equals(f)) {
				itr.remove();
			}
//			System.out.prin	tln(itr.next());
//			
			
		}
		
		System.out.println(flowers);
		
		
		
	}
	
	public static void main(String[] args) {
		flw();
	}
}
