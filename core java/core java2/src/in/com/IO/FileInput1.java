package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInput1 {
public static void main(String[] args) throws Exception {
	
	FileInputStream in = new FileInputStream("C:\\Users\\Pc\\Desktop\\IOSFolder\\tharr.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\Pc\\Desktop\\IOSFolder\\carr.jpg");
	
	int ch = in.read();
	while(ch!=-1) {
		out.write(ch);
		ch = in.read();
	}
	in.close();
	out.close();
	System.out.println("Data copy Sucessfully");
}
}

