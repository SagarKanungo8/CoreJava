package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("C:\\Users\\Pc\\Desktop\\IOSFolder\\Sagar.txt");
		writer.write("Hello I am Sagar");
        writer.write("Its Wednesday");		
		writer.close();
		System.out.println("Data Write SucessFully");
		
		
		
	}

}
