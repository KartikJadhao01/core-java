package task;

public class digitalLock {

	private int pin;
	private boolean matched;
	
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setMatched(boolean matched) {
		this.matched=matched;
	}
	
	public boolean getMatched() {
		return matched;
	}
	
	public static void main(String[] args) {
		digitalLock d=new digitalLock();
		d.setPin(1111);
		System.out.println(d.getPin());
		d.setMatched(true);
		
		if(d.getMatched()) {
			System.out.println("Successful");
		}
		else {
			System.out.println("Unsuccessful");
		}
	
			
	}
}
