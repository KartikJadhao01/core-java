package core;

public class student {
	String name;   //properties
	String email;
	long mobile;
     
	void study() {  //  Behavior
		System.out.println("Studying");
	}
	void play() {
		System.out.println("Playing");
	}
	
	public static void main(String[] args) {
		student student1=new student();
		student1.name="Kartik";
		student1.email="k@gmail.com";
		student1.mobile=1212154454;
		System.out.println("student1 name is:"+student1.name);
		System.out.println("student1 email is:"+student1.email);
		System.out.println("student1 mobile no. is:"+student1.mobile);
		student1.study();
		student1.play();
		
		System.out.println("--------------------------------------------------------------------------");
		
		student student2=new student();
		student2.name="Vishal";
		student2.email="v@gmail.com";
		student2.mobile=989465162;
		System.out.println("student2 name is:"+student2.name);
		System.out.println("student2 email is:"+student2.email);
		System.out.println("student2 mobile no. is:"+student2.mobile);
		student1.study();
		student1.play();
	}
}
