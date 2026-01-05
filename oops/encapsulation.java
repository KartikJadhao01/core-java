package oops;

public class encapsulation {
	private int emp_id;
	private int emp_salary;
	
	public void setemp_id(int emp_id) {
		this.emp_id=emp_id;
	}
	public int getemp_id() {
		return emp_id;
	}
	
	public void setemp_sal(int emp_salary) {
		this.emp_salary=emp_salary;
	}
	public int getemp_sal() {
		return emp_salary;
	}
	
	public static void main(String[] args) {
		encapsulation e=new encapsulation();
		e.setemp_id(201);
		System.out.println(e.getemp_id());
		
		e.setemp_sal(10000);
		System.out.println(e.getemp_sal());
	}
}
