package in.com.raysOOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson1 {

	public static void main(String[] args) throws Exception {
		
String str = "17/08/2023";
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

Person1 p = new Person1();
p.setName("Sagar");
p.setId(10);
p.setDob(sdf.parse(str));

System.out.println(p.getDob());
System.out.println(p.getName());
System.out.println(p.getId());


	}

}
