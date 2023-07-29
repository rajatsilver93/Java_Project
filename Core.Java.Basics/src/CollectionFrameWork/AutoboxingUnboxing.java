package CollectionFrameWork;

public class AutoboxingUnboxing {
public static void main(String[] args) {
	int i = 10;
	//Integer i1=i; //--primitive to wrapper
	//or
	Integer i1 = new Integer(i);
	
	int i2= i1.intValue();  //--wrapper to primitive
	
}
}
