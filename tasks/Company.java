package task;

abstract class employee{
	abstract void name();
	abstract void salary();
}

class manager extends employee{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("KArtik");
		
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("10000");
		
	}
}

class developer extends employee{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Ram");
		
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("5000");
		
	}
	
	
	
}

public class Company{
	public static void main(String[] args) {
		developer d=new developer();
		d.name();
		d.salary();
		
		manager m=new manager();
		m.name();
		m.salary();
	}
}


