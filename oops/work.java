package oops;

public interface work {
	void salary(); //abstract method
	
	static void name() {
		System.out.println("Rita");
	}
	
	default void email() {
		System.out.println("r@gmail.com");
	}
}
