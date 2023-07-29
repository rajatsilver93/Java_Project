package shapearray;

public class Circle extends shape {
	private int radius;
	public static final double PI=3.14;

	public Circle(int radius) {
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() { 
		double z =PI*radius*radius;
		System.out.println("Circle = "+z);
		return z;
	}
}
