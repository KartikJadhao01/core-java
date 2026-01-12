package task;

import java.io.File;
import java.io.IOException;

public class FileH {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Kartik\\Kartik.txt");
		f.createNewFile();
		System.out.println("created new file");
		System.out.println("Read: " + f.canRead()); 
	    System.out.println("Write: " + f.canWrite()); 
	    System.out.println("File Exists: " + f.exists()); 
	    System.out.println("Is File: " + f.isFile());     
	    System.out.println("Absolute Path: " + f.getAbsolutePath());
	    System.out.println("File Name: " + f.getName());
	    System.out.println("Total Space: " + f.getTotalSpace()); 
	    System.out.println("Is Directory: " + f.isDirectory()); 
	    System.out.println("Is Hidden: " + f.isHidden());
	    System.out.println( "Renamed: " +f.renameTo(f)); 
	    System.out.println("Deleted: " + f.delete()); 
	    System.out.println("mkdir:"+f.mkdir());
		
	}
}
