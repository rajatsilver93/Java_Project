package CollectionFrameWork;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack a = new Stack();
		a.push("Rajat");
		a.push("Arun");
		a.push("Monil");
		System.out.println(a);

	a.pop();
	a.pop();
	a.pop();
	a.push(1);
	System.out.println(a);
	}



}
