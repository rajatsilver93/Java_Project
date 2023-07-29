package Abstract;

public abstract class  Shape {

	private String color;
	private int Borderwidth;
	public abstract  void area();
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return Borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.Borderwidth = borderwidth;
	}


	
}

