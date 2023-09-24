package in.com.raysInheritance;

public class Circle1 extends Shape1 {

	private int radius = 0;
	private final double PI = 3.14;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	
	public double area() {
		double cArea = PI * getRadius() * getRadius();
		System.out.println("This Is Circle Area " + cArea);
		return cArea;
	}
	
	
	
}
