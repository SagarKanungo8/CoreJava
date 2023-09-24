package in.core.rays;

public class Shape {

	private int borderwidth=0;
	private String color=null;
	
	public Shape() {
	
	}
	
	public Shape(int borderwidth,String color) {
		this.borderwidth=borderwidth;
		this.color=color;
	}
	
	public void setBorderWidth(int borderwidth) {
		this.borderwidth=borderwidth;
	}
	public int getBorderWidth() {
		return borderwidth;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	
}