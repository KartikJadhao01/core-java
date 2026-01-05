package oops;

public class task_encap {
	private String login_id;
	private String pass;
	
	public void set_login(String login_id) {
		this.login_id=login_id;
	}
	
	public String get_login() {
		return login_id;
	}
	
	public void set_pass(String pass) {
		this.pass=pass;
	}
	
	public String get_pass() {
		return pass;
	}
	
	public static void main(String[] args) {
		task_encap e=new task_encap();
		e.login_id("Kartik");
//		System.out.println(e.login_id(login_id));
	}

	private void login_id(String string) {
		// TODO Auto-generated method stub
		
	}
}
