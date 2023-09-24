package in.com.raysInheritance;

public class Triangle1 extends Shape1{
	
	private int height = 0;
	private int base = 0;
	
	public void setHeight(int height) {
		this.height = height;
	}
    public int getHeight() {
    	return height;
    }
    
    public void setBase(int base) {
    	this.base = base;
    }
    public int getBase() {
    	return base;
    }
    
    public double area() {
    	double tArea = ((getHeight()*(getBase())))/2;
    	System.out.println("This Is Triangle Area " + tArea);
    	return tArea;
    }
    
    
    
    
}
