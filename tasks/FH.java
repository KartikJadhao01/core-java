package task;

import java.io.File;
import java.io.IOException;

//check whether file is created or not if created successfully else unsuccessful
//check whether file exist or no if exist then delete the file


public class FH {
public static void main(String[] args) throws IOException {
	File a=new File("C:\\Users\\Kartik\\Task.txt");
	a.createNewFile();
	
	if(a.exists()==true) {
		System.out.println("File created Successfully");
	}
	else {
		
		System.out.println("File not created");
	}
	
	
	a.exists();
	if(a.exists()==true) {
		System.out.println("File Exist");
		if(a.delete()) {
			System.out.println("File Deleted");
		}
	}
	else {
		System.out.println("File not Exist");
	}
}
}
