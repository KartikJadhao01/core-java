package core;

public class variabletype {
	int num=50; //Global variable
	static int n=10; //static variable
public static void main(String[] args) {
	div();
	variabletype vt=new variabletype();
	vt.add();
	System.out.println(vt.sub());
	
}

void add() { //nonstatic method
	int a=20; //local variable
	System.out.println("Addition is "+(a+90));
	System.out.println("Globa variable is:"+num);
}

int sub() { //return type method
//	System.out.println("Global variable is:"+num);
	return 20-10;
}

static void div() { //static method
	int m=90;
	System.out.println(n/5);
}
}
