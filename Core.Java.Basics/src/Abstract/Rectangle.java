package Abstract;

public class Rectangle extends Shape{
	private int lenght;
	private int width;
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void area(double e) {
		 e= lenght*width;
		System.out.println(e);
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

}
