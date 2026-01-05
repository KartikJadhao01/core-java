package core;

public class stringDemo {
public static void main(String[] args) {
	String name="kartik jadhao";
	System.out.println("Name is:"+name);
	System.out.println("lenght:"+name.length()); //lenght of string
	System.out.println(name.toLowerCase());      //lower case
	System.out.println(name.toUpperCase());      //upper case
	System.out.println(name.charAt(2));          //character at which index
	System.out.println(name.indexOf("k"));      //index of character
	System.out.println(name.concat("jadhao"));  //add to existing string 
	System.out.println(name.contains("k"));     //string contains character or not
	System.out.println(name.endsWith("k"));     //is string end with specific character
	System.out.println(name.startsWith("a"));   //is string starts with specific character
	System.out.println(name.isEmpty());         //string is empty or not 
	System.out.println(name.replace("k","M"));  //replace charater with another character
	System.out.println(name.lastIndexOf("k"));  //
	System.out.println(name.repeat(2));
	System.out.println(name.trim());
    String str[]=name.split(" ");
    for(int i=0;i<str.length;i++) {
    	System.out.println(str[i]);
    }
//    char ar[]=name.toCharArray();
//    for(int i=0;i<ar.lenght;i++) {
//    	System.out.println(ar[i]);
//    }
    System.out.println(name.substring(3));
    System.out.println(name.substring(1,5));
    System.out.println(name.equals("kartik"));
    System.out.println(name.equalsIgnoreCase("Kartik Jadhao"));
//    System.out.println(name.);
}
}
