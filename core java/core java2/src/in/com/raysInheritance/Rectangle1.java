package in.com.raysInheritance;

public class Rectangle1 extends Shape1 {
	
	private int length = 0;
	private int width = 0;
	
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
    public double area() {
    int rArea = getLength() * getWidth();
    System.out.println("This Is Rectangle Area " + rArea);
    return rArea;
}
}