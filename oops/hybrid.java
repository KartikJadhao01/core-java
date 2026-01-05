package oops;

class hybridparent{
	void hp() {
		System.out.println("Parent");
	}
}

class hybridchild1 extends hybridparent{
	static void ch1() {
		System.out.println("Child1");
	}
}

class hybridchild2 extends hybridparent{
	void ch2() {
		System.out.println("Child2");
	}
}

class hybridsubchild extends hybridchild2{
	void hsc() {
		System.out.println("Subchild");
	}
}
public class hybrid {
	public static void main(String[] args) {
		hybridsubchild ob=new hybridsubchild();
		ob.hp();
		ob.ch2();
		ob.hsc();
		
//		hybridchild1 obj=new hybridchild1();
//		obj.ch1(); 
		hybridchild1.ch1();
		
	}

}
