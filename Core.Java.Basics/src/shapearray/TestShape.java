package shapearray;

public class TestShape {
	public static void main(String[] args) {
	
		shape [] s = new shape[3];
		s[0] = new Rectangle(10, 5);
		s[1] = new Circle(4);
		s[2] = new Triangle(10, 10);
		
		double totalArea = 0;
		
		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();
		}	
		System.out.println("total area-"+totalArea);
}
}
