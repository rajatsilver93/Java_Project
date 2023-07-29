package shapearray;

public class Triangle extends shape {
	private int base;
	private int height;
	
	
	public Triangle(int base , int height) {
		this.base=base;
		this.height=height;
		
	}

	public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}

	public double area() {
		double t = (0.5*base*height);
	System.out.println("Triangle = "+t);
		return 0.5*base*height;
	}
}
