package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\Pc\\Desktop\\IOSFolder\\SK.txt");
		
		PrintWriter out = new PrintWriter(file);
		out.println("I am Sagar");
		out.println("Student Of Rays");
		file.close();
		out.close();
		System.out.println("Data Write Sucessfully");
	}

}
