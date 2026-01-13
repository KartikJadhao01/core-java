package task;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileOS {
	public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("data.txt");

        String text = "Happy Sankrant";
        fos.write(text.getBytes());

        fos.close();
        System.out.println("Data write successfully.");
    }
}
