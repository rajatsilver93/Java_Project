package constructer;

public class TestShape {
public static void main(String[] args) {
	Rectangle r = new Rectangle(4, 5);
	Circle c = new Circle(2);
	Triangle t = new Triangle(4, 7);

	
	
//	System.out.println("BorderWidth of Rectagle- "+r.getBorderwidth());
	System.out.println("Area of Rectangle- "+r.area());
	System.out.println("Area of Circle- "+c.area());
	System.out.println("Area of Triangle- "+t.area());
}
}
