package oops;

class p{
	void data() {
		System.out.println("Fortune Cloud");
	}
}

class ch extends p{

	void db() {
		System.out.println("Technologia");
	} 
}

public class singleInheritance {
public static void main(String[] args) {
	ch ob=new ch();
	ob.data();
	ob.db();
}
	
}
