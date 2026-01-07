package task;

class hostel1 {
	 void name() {
		 System.out.println("Mauli");
	 }
	 
}

class vacancy extends hostel1{
	void vacant() {
		 System.out.println("Vacant");
	 }
}

public class hostel{
	public static void main(String[] args) {
		vacancy v=new vacancy();
		v.name();
		v.vacant();
	}
}
	 


