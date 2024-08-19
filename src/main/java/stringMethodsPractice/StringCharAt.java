package stringMethodsPractice;

public class StringCharAt {

	String a = "Selvi";
	String b = " Jashwanth ";
	String c = "Naveen Kumar";
	String d = "Hai";

	public static void main(String[] args) {

//		How to get a particular character(letter) value
		StringCharAt obj = new StringCharAt();
		obj.methodCharAt(obj.a);
		obj.methodCharAt(obj.b);
		obj.methodCharAt(obj.c);
		obj.methodCharAt(obj.d);// StringIndexOutOfBoundsException - If we are passing a greater index value,
								//then we will get this exception

	}

	public int methodCharAt(String abc) {

		System.out.println(abc.charAt(4));
		return 0;
	}
}