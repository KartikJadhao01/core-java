package oops;

class company{
	void details() {
		System.out.println("cravita");
		System.out.println("It Company");
	}
}

class employee extends company{
	void details() {
		super.details();
		System.out.println("Kartik");
		System.out.println("Intern");
	}
}

public class meethodoverriding {
	public static void main(String[] args) {
		employee obj=new employee();
		obj.details();
	}

}
