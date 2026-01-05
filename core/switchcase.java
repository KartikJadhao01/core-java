package core;

public class switchcase {
public static void main(String args[]) {
	//check whether fortune cloud is matching with mindscripts, fortune cloud and qspider
	
	String insti="fortune cloud";
	
	switch(insti) {
	case "mindscripts" : System.out.println("matching with mindscripts");
	break;
	case "fortune cloud" : System.out.println("matching with fortune cloud");
	break;
	case "qspider" : System.out.println("matching with qspider");
	break;
	default:System.out.println("Not matching");
	}
}
}
