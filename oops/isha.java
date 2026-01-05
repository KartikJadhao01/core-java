package oops;

public class isha {

	int id;
	String email;
	
	isha(int id,String email){
		this.id=id;
		this.email=email;
		System.out.println("parameter isha's id:"+id+"email:"+email);
	}
	
	isha(isha s){
		this.id=s.id;
		this.email=s.email;
		System.out.println("copy constructor isha's id:"+id+"email:"+email);
	}
	
	public static void main(String[] args) {
		isha i=new isha(101,"isha@gmail.com");
		System.out.println("---------------------------");
		System.out.println("instance variable isha's id:"+i.id+"email:"+i.email);
		System.out.println("---------------------------");
		isha i2=new isha(i);
		System.out.println("instance variable isha's id:"+i2.id+"email:"+i2.email);
	}
}
