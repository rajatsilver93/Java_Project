package ios;

import java.io.Serializable;

public class Marksheet implements Serializable {
	public int rollno;
	public String name;
	public int physics;
	public int chemistry;
	public int maths;
	public transient int total =0;
	

}
