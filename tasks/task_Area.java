package oops;

public class task_Area {

	void area(int a) {
		int area=a*a;
		System.out.println("Area of Square is "+area);
	}
	
	void area(int l,int b) {
		int area=l*b;
		System.out.println("Area of Rectangle is "+area);
	}
	
	void area(double r) {
		double area=3.14*r*r;
		System.out.println("Area of Circle is "+area);
	}
	
	void area(double l,double h) {
		double area=0.5*(l*h);
		System.out.println("Area of Triangle is "+area);
	}
	
	public static void main(String[] args) {
		task_Area obj=new task_Area();
		obj.area(5);
		obj.area(2, 3);
		obj.area(4.0);
		obj.area(5.0,4.0);
	}
}
