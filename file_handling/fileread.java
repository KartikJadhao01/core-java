package file_handling;

import java.io.FileReader;
import java.io.IOException;

public class fileread {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("data.txt");
	
	int character;
	while((character=fr.read())!=-1) {
		System.out.print((char) character);
	}
	
}
}

//bufferReader difference
//bufferWriter
