package oops;

class country{
	void india() {
		System.out.println("India is my country");
	}
}

class state extends country{
	void maha() {
		System.out.println("Maharashtra is my Home sate");
	}
}

class city extends state{
	void pune() {
		System.out.println("I live in Pune");
	}
}

public class details {
	//print the details of names of country and state and city by multilevel inheritance

	public static void main(String[] args) {
		city ob=new city();
		ob.india();
		ob.maha();
		ob.pune();
	}

}

