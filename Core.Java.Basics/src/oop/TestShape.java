package oop;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setColor("brown");
		s.setBorderwidth(2);
		System.out.println("color -" +s.getColor());
		System.out.println("borderwidth- " +s.getBorderwidth());
        System.out.println(Shape.PI);
	}


}
