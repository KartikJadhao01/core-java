package oops;

public class task_client {

	String name;
	long mo_no;
	
	task_client(String name,long mo_no){
		this.name=name;
		this.mo_no=mo_no;
	}
	
	task_client(task_client c){
		this.name=c.name;
		this.mo_no=c.mo_no;
	}
	
	public static void main(String[] args) {
		task_client c=new task_client("Kartik",962340044);
		System.out.println("instance variable client name:"+c.name+" mobile:"+c.mo_no);
		System.out.println("--------------------------------------------------------------");
		task_client c1=new task_client(c);
		System.out.println("copy client name:"+c1.name+" mobile:"+c1.mo_no);
	}
}
