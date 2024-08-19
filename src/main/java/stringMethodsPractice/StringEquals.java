package stringMethodsPractice;

public class StringEquals {

	String a = "Selvi";
	String b = " Jashwanth ";
	String c = "Naveen Kumar";
	String d = "Hai";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		To check if two Strings are equal.This is boolean. This checks case sensitivity(lower and upper case)
//		Will return True - if the value matches exactly
//				False - if it does not match
		StringEquals obj = new StringEquals();
		obj.MethodEqual(obj.a);
		obj.MethodEqual(obj.b);
		obj.MethodEqual(obj.c);
		obj.MethodEqual(obj.d);
		
	}

	
	public boolean MethodEqual(String abc) {

		StringEquals obj = new StringEquals();

		System.out.println(abc.equals(obj.b));
		return abc.equals(obj.b);

	}
	
	
}
