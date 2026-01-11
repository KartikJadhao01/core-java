package task;

interface transaction{
	void payment();
}

class cash implements transaction{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("CAsh Payement");
		
	}
	
}

class online implements transaction{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Online Payment");
	}
	
}

public class petrolPump {
public static void main(String[] args) {
	cash c=new cash();
	c.payment();
	
	online o=new online();
	o.payment();
}
}
