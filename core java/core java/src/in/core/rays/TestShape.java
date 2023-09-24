package in.core.rays;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape(10,"red");
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
		
		s.setColor("Red");
		s.setBorderWidth(100);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
		
		
		
		
		
	}

}
