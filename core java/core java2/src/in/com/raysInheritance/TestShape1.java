package in.com.raysInheritance;

public class TestShape1 {
	
	public static void main(String[] args) {
		
		Shape1[] s = new Shape1[3];
		
		s[0] = new Rectangle1();
		s[1]= new Circle1();
		s[2]= new Triangle1();
		
		Rectangle1 r1 =(Rectangle1) s[0];
		r1.setLength(10);
		r1.setWidth(10);
		//r1.area();
		
		Circle1 c1 = (Circle1) s[1];
		c1.setRadius(3);
		//c1.area();
		
		Triangle1 t1 = (Triangle1) s[2];
		  t1.setHeight(20);
		  t1.setBase(20);
		  //t1.area();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		
		//Rectangle r1 = new Rectangle();
	//	r1.setLength(10);
		//r1.setWidth(20);
		//r1.area();
			
		//}
	   // Circle1 c1 = new Circle1();
	    //c1.setRadius(2);
	    //c1.area();
	//}
//	     Triangle1 t1 = new Triangle1();
	//     t1.setHeight(10);
	  //   t1.setBase(15);
	    // t1.area();
	     
	
}
	}
}

