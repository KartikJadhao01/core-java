package core;

public class stringUse {
public static void main(String[] args) {
	String str=new String("Kartik");
	System.out.println("String is:"+str);
	
	System.out.println(str.length());  //lenght
	System.out.println(str.charAt(2));  //charcter at index 2
	System.out.println(str.indexOf("r")); //index of character
	System.out.println(str.lastIndexOf("k"));
	System.out.println(str.contains("t")); //string contains specific character or not
	System.out.println(str.repeat(2));  //repeats string
	System.out.println(str.concat(" Jadhao")); 
	System.out.println(str.split("t"));
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.replace("k", "m"));
	System.out.println(str.endsWith("a"));
	System.out.println(str.startsWith("a"));
	System.out.println(str.equals("kartik"));
	System.out.println(str.equalsIgnoreCase("kartik"));
	System.out.println(str.isEmpty());
	
}
}
