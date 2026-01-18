package task;



class Youtube extends Thread {
	public void run() {
        System.out.println("Open Youtube");
    }
}

class Video extends Thread {
    public void run() {
        System.out.println("Play video");
    }
}

public class multiusimultithread {
    public static void main(String[] args) {
    	Youtube m = new Youtube();
        m.start();

        Video v = new Video();
        v.start();
    }
}
