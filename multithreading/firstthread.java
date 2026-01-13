package multithreading;

public class firstthread extends Thread {//1.extends thread class
	
	public void run() { //2.override run method
		//block of code or task that is executed by thread
		System.out.println("First Thread");
	}
	
	public static void main(String[] args) {
		firstthread thread1=new firstthread();
		thread1.start();
}
}
