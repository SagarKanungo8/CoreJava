package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
public static void main(String[] args) throws Exception {
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\Pc\\Desktop\\IOSFolder\\obj.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	
	Employee e = new Employee();
	e.empId = 1;
	e.name = "Sagar";
	e.salary = 10000;
	e.bonus = 2000;
	e.total = e.salary + e.bonus;
	
	out.writeObject(e);
	file.close();
	out.close();
	System.out.println("Obj Converted Into Byte Stream");
	
	
	
}
}
