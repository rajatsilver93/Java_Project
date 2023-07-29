
public class excreversestr {
	public static void main(String[] args) {
	String str1= "core ";
	String str2 = "";
	String str3 = "java";
	String str4 = "";
	for (int i = 0; i < str1.length(); i++) {
		str2= str1.charAt(i)+str2;
	}System.out.print(str2 + "\t");
	for (int i = 0; i < str3.length(); i++) {
		str4= str3.charAt(i)+str4;
	}System.out.print(str4 );
	}

}
