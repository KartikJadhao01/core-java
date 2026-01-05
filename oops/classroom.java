package oops;

public class classroom {

	classroom(){
		System.out.println("Default Constructor");
	}
	
	classroom(int a){
		System.out.println("Parameterized Constructor");
	}
	
	private classroom(int b,String a) {
		System.out.println("Private Constructor");
	}
	
	
	public static void main(String[] args) {
		classroom c=new classroom();
		classroom cb=new classroom(1);
		classroom cc=new classroom(2,"ka");
		
	}
}
