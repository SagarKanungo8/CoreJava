package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestMarksheet2 {
public static void main(String[] args) throws Exception {
	
	FileInputStream file = new FileInputStream("C:\\Users\\Pc\\Desktop\\IOSFolder\\objectt.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	Marksheet m = (Marksheet) in.readObject();
	System.out.println("StudentName="+m.StudentName);
	System.out.println("RollNo="+m.RollNo);
	System.out.println("PhysicsMarks="+m.PhysicsMarks);
	System.out.println("ChemestryMarks="+m.ChemestryMarks);
	System.out.println("MathsMarks="+m.MathsMarks);
	System.out.println("TotalMarks="+m.Totalmarks);
	System.out.println("Percentage="+m.Percentange);
	file.close();
	in.close();
}
}
