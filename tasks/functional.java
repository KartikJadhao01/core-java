
package task;

public class functional implements remote{

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		System.out.println("Volume Up");
		System.out.println("Volume Down");
	}
	
	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("Mute");
	}
	
	@Override
	public void fun_switch() {
		// TODO Auto-generated method stub
		System.out.println("Switch");
	}
	
	public static void main(String[] args) {
		functional f=new functional();
		f.volume();
		f.mute();
		f.fun_switch();
	}

	

	
	
}
