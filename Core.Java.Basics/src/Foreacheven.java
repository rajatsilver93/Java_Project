
public class Foreacheven {
public static void main(String[] args) {
	
	int[]table= {1,2,3,4,5,6,7,8,9,10};
	for(int i= 0 ; i<table.length; i++) {
		if (table[i]%2 ==0) {
			System.out.println("the number is even - "+table[i]);
		}
	}
	
}}