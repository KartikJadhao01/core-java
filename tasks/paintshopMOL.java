package exception_handling;

public class paintshopMOL {

	void cre_paint(String color) {
		System.out.println("Original color:"+color);
	}
	
	void cre_paint(String color1,String color2) {
		System.out.println("Mixing 2 colors:"+color1+" and "+color2);
	}
	
	void cre_paint(String color1,String color2,String color3) {
		System.out.println("Mixing 3 colors:"+color1+", "+color2+" and "+color3);
	}
	
	public static void main(String[] args) {
		paintshopMOL p=new paintshopMOL();
		p.cre_paint("Red");
		p.cre_paint("Red","Green");
		p.cre_paint("Blue", "Red", "White		");
	}
}
