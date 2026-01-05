package oops;

public class methodoverloading {

	void payment() {
		System.out.println("Debit");
	}
	
	void payment(int a) {
		System.out.println("Credit");
	}
	
	void payment(int b, String a) {
		System.out.println("UPI");
	}
	
	void payment(char ch) {
		System.out.println("Wallet");
	}
	
	void payment(String d,int y) {
		System.out.println("Cash On Delivery");
	}
	
	public static void main(String[] args) {
		methodoverloading obj=new methodoverloading();
		obj.payment();
		obj.payment(2);
		obj.payment(10, "K");
		obj.payment('K');
		obj.payment("J", 100);
	}
	
}
