package oops;

class Teacher{
	String name;
	long ph_no;
	
	void show(String name,long ph_no) {
		this.name=name;
		this.ph_no=ph_no;
		System.out.println(name+" "+ph_no);
		}
}

public class task_mr {
public static void main(String[] args) {
	Teacher ob=new Teacher();
	ob.show("Kartik", 57541521);
	System.out.println("---------------------------------");
	System.out.println(ob.name);
	System.out.println(ob.ph_no);

	
}
}
