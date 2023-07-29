package constructer;

public class Shape {
	private String color;
	private int borderwidth;
	public static final double PI=3.14;
    public Shape() {
	}
    public Shape(String color  , int borderwidth) {
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
    
}
