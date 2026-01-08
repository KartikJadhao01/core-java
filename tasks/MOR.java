package oops;

class Institute{
	void details() {
		System.out.println("Fortune Cloud");
		System.out.println("Training Institute");
	}
}

class students extends Institute{
	void details() {
		super.details();
		System.out.println("Kartik");
		System.out.println("Java Full Stack");
	}
}

public class MOR {
	public static void main(String[] args) {
		students obj=new students();
		obj.details();
	}
}
