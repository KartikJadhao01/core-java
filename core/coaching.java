package core;

public class coaching {
String name;
String course;
int totalstud;

void teach() {
	System.out.println("Good Teaching");
}

void techtalk() {
	System.out.println("Every Saturday");
}

public static void main(String[] args) {
	coaching c1=new coaching();
	c1.name="Fortune Cloud";
	c1.course="Java";
	c1.totalstud=200;
	System.out.println("Coaching name: "+c1.name);
	System.out.println("Course name: "+c1.course);
	System.out.println("Total Students: "+c1.totalstud);
	c1.teach();
	c1.techtalk();
	
	System.out.println("-----------------------------------------------");
	
	coaching c2=new coaching();
	c2.name="Qspider";
	c2.course="Python";
	c2.totalstud=100;
	System.out.println("Coaching name: "+c2.name);
	System.out.println("Course name: "+c2.course);
	System.out.println("Total Students: "+c2.totalstud);
	c2.teach();
	c2.techtalk();
}
}

