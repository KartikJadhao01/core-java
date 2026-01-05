package oops;

class country1
{
	void ind() {
		System.out.println("India");
	}
}

class state1 extends country1{
	void mah() {
		System.out.println("Maharashtra");
	}
}

class union extends country1{
	void uter() {
		System.out.println("Daman");
	}
}
public class hierarchical {

	public static void main(String[] args) {
		state1 st=new state1();
		st.ind();
		st.mah();
		
		union ut=new union();
		ut.ind();
		ut.uter();
	}
}
