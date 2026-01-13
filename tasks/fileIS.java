package task;

import java.io.FileInputStream;
import java.io.IOException;

public class fileIS {
	public static void main(String[] args)  throws IOException{

        FileInputStream f = new FileInputStream("data.txt");

        int data;
        while ((data = f.read()) != -1) {
            System.out.print((char) data);
        }

        f.close();

    }
}
