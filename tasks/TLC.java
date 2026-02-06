package task;

public class TLC extends Thread {
	public void run(){
        System.out.println("Run");
    }
    public static void main(String[] args) {
        TLC t = new TLC();
        System.out.println("Thread name: " + t.getName());
        System.out.println("Thread state before start: " + t.getState());
        t.start();
        System.out.println("Thread state after start: " + t.getState());
//        t.sleep(1000);
        t.run();
        System.out.println("Thread state: " + t.getState());
        System.out.println("Thread status: " + t.isAlive());

    }
}

