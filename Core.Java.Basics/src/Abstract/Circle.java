package Abstract;

public class Circle extends Shape{
	private int Radius;

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}
	public void area(double c) {
		 c=Math.PI*Radius*Radius;
		System.out.println(c);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	
		
	

}
