package oops;

class edu_soc{
	void name() {
		System.out.println("KJ Education Society");
	}
}

class institute extends edu_soc{
	void name() {
		super.name();
		System.out.println("Trinity");
	}
}

class degree extends institute{
	void name() {
		super.name();
		System.out.println("Engineering");
	}
}

class stream extends degree{
	void name() {
		super.name();
		System.out.println("CS");
	}
}

public class task_superMLI {

	public static void main(String[] args) {
		stream obj=new stream();
		obj.name();
	}

}
