package core;

public class hostel {
String hostelname;
int totalrooms;

void vacancy() {
	System.out.println("vacant");
}

void restrictions() {
	System.out.println("No restrictions");
}

public static void main(String[] args) {
	hostel h1=new hostel();
	h1.hostelname="Mauli PG";
	h1.totalrooms=10;
	System.out.println("Hostel name is "+h1.hostelname);
	System.out.println("Total rooms in hostel are "+h1.totalrooms);
	h1.vacancy();
	h1.restrictions();
	
	System.out.println("-----------------------------------------------------");
	
	hostel h2=new hostel();
	h2.hostelname="KJ Boys Hostel";
	h2.totalrooms=20;
	System.out.println("Hostel name is "+h2.hostelname);
	System.out.println("Total rooms in hostel are "+h2.totalrooms);
	h2.vacancy();
	h2.restrictions();
}

	
}
