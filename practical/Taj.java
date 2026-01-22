package practical;

public class Taj {
public static void main(String[] args) {
	String s = "Taj";
	String new_str = "";
	
	for(int i = 0; i < s.length(); i++) {
		new_str = new_str + s.substring(i, i + 1) + '@';	
	}
	System.out.println("After repeating each character twice: " + new_str);
}
}

