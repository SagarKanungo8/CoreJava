package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class TestMarksheet1 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Pc\\Desktop\\IOSFolder\\objectt.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		
		m.StudentName = "Sagar";
		m.RollNo = 01;
		m.PhysicsMarks = 95;
		m.ChemestryMarks = 93;
		m.MathsMarks = 94;
		m.Totalmarks = m.PhysicsMarks + m.ChemestryMarks + m.MathsMarks;
		m.Percentange = m.Totalmarks/3;
		
		out.writeObject(m);
		file.close();
		out.close();
		System.out.println("Object Converted Into ByteStream");
		
		
		
		
	}
	
	
	
}
