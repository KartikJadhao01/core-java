package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter{
public static void main(String[] args) throws IOException {
	
	FileWriter fw=new FileWriter("C:\\Users\\Kartik\\filewrite.txt");
	fw.write("Hello");
	fw.write("\nMakarsankrant");
	fw.append("KArtik");
	
	fw.close();
	System.out.println("File writed successfully");
	
	
	
}
}
