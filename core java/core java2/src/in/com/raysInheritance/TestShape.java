package in.com.raysInheritance;

public class TestShape {

	public static void main(String[] args) {
	
		//Shape s = new Rectangle();
		//Rectangle r1 = (Rectangle) s;
	    //Rectangle r1 = new Rectangle();
		//r1.setBorderWidth(12);
		//r1.setColor("blue");
		//r1.setLength(14);
		//r1.setWidth(23);
		
		//System.out.println(r1.getBorderWidth());
		//System.out.println(r1.getColor());
		//System.out.println(r1.getLength());
		//System.out.println(r1.getWidth());
		
		Shape s = new Shape();
		s.setBorderWidth(10);
		s.setColor("Black");
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(10);
		r.area();
		
		Shape s1 = new Rectangle();
		Rectangle r1 =(Rectangle) s1;
		r1.setLength(12);
		r1.setWidth(10);
		r1.area();

	}

}
