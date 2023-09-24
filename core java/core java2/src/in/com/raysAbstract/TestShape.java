package in.com.raysAbstract;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		s.area();
		s.hello();
		Shape.hello();
		
		Rectangle r = (Rectangle) s;
		r.area();
		r.hello();
	}
}
