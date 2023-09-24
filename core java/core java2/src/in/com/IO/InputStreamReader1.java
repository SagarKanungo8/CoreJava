package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReader1 {
public static void main(String[] args) throws Exception {
	
	InputStreamReader isReader = new InputStreamReader(System.in);
	
	BufferedReader in = new BufferedReader(isReader);
	PrintWriter out = new PrintWriter("C:\\Users\\Pc\\Desktop\\IOSFolder\\Skkk.txt");
	String line = in.readLine();
	
	while(!(line.equals("Bye"))) {
	
	out.println(line);
	line = in.readLine();
	}
	in.close();
	out.close();
    isReader.close();	
}
}
