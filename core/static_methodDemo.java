package core;

public class static_methodDemo {
public static void main(String[] args) {
//	display();          //1st method to call ...
	static_methodDemo.display();   //2nd method to call ...
	
	System.out.println(cityname());
}

static void display() {
	System.out.println("Kartik");
}

static String cityname() {
	return "Pune";
}
}
