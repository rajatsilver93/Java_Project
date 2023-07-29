package CollectionFrameWork;

import java.util.Stack;

public class StackPushPop {
public static void main(String[] args) {
	Stack s = new Stack();
	Stack s1 = new Stack();

	for (char i = 'A'; i <= 'Z'; i++) {
		s.push(i);
	
	}
	System.out.println(s);
	System.err.println("size--> "+s.size());
	for (int i = s.size() ; i > 0; i--) {

		s1.push(s.pop());
	}
	System.out.println(s1);
}
	
}

