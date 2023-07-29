package shapearray;

public class shape {
	private String color;
	private int borderwidth;
	public static final double PI=3.14;
    public shape() {
	}
    public shape(String color  , int borderwidth) {
    	this.color=color;
    	this.borderwidth=borderwidth;
    }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public double area() {
		
		return 0;
	
	}
    

}
