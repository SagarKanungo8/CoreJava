package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class TestDeserialization1 {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Pc\\Desktop\\IOSFolder\\obj.txt");
		ObjectInputStream in =new ObjectInputStream(file);
		
		Employee e = (Employee) in.readObject();
		System.out.println("Emp Id =" + e.empId);
		System.out.println("Name =" + e.name);
		System.out.println("Salary =" + e.salary);
		System.out.println("Bonus =" + e.bonus);
		System.out.println("total =" + e.total);
		
		file.close();
		in.close();
	}

}
