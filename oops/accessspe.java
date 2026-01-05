package oops;

class a{
	void show() {
		System.out.println("Happy");
	}
}

class b extends a{
void data() {
	System.out.println("New Year");
}
}
public class accessspe {
public static void main(String[] args) {
	b obj=new b();
	obj.show();
//	obj.data();

}
}
