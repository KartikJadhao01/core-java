package oops;

public class copyconstructor {

	int id;
	String email;
	
	copyconstructor(int id,String email){
		this.id=id;
		this.email=email;
		System.out.println("parameter isha's id:"+id+"email:"+email);
	}
	
	copyconstructor(copyconstructor s){
		this.id=s.id;
		this.email=s.email;
		System.out.println("copy constructor isha's id:"+id+"email:"+email);
	}
	
	public static void main(String[] args) {
		copyconstructor i=new copyconstructor(101,"isha@gmail.com");
		System.out.println("---------------------------");
		System.out.println("instance variable isha's id:"+i.id+"email:"+i.email);
		System.out.println("---------------------------");
		copyconstructor i2=new copyconstructor(i);
		System.out.println("instance variable isha's id:"+i2.id+"email:"+i2.email);
	}
}

