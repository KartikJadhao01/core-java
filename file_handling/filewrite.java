package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
public static void main(String[] args) throws IOException{
	File f2=new File("C:\\Users\\Kartik\\jan12.txt");
	if(f2.createNewFile()) {
		System.out.println("Demo file is created");
	}
	else {
		System.out.println("DEmo f'ile is created");
	}
	
	FileWriter fw2=new FileWriter("data.txt", true);
	fw2.write("File writer class");
	fw2.close();
}
}
