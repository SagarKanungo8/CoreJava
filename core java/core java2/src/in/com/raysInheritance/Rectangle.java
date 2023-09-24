package in.com.raysInheritance;

public class Rectangle extends Shape{
	
	private int length=0;
	private int width=0;
	
	
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	
	public void area() {
		int rArea = getLength() * getWidth();
		System.out.println("Rectangle Area = " + rArea );
	} 
	
	
}

	