package multithreading;

public class runableinter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		runableinter r=new runableinter();
		Thread t=new Thread(r);
		t.start();
	}
}



