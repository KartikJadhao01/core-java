package task;


class edu_soc{
	void name() {
		System.out.println("KJ");
	}
}

class college extends edu_soc{
	void name() {
		super.name();
		System.out.println("Trinity");
	}
}

class degree extends college{
	void name() {
		super.name();
		System.out.println("Engineering");
	}
}
public class mih {
     public static void main(String[] args) {
		degree d=new degree();
		d.name();
	}
}
