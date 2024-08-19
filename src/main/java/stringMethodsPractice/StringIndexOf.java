package stringMethodsPractice;

public class StringIndexOf {

	String a = "Selvi";
	String b = " Jashvanth dev";
	String c = "Naveen Kumar";
	String d = "Hello";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//indexOf() - returns the position of the first occurrence of the specified character or string in a specified string.
		

//		If it is not found, it returns -1. The index counter starts from zero.

		StringIndexOf obj =new StringIndexOf();
		System.out.println("Index position of V");
		obj.methodIndexOf(obj.a);
		obj.methodIndexOf(obj.b);
		obj.methodIndexOf(obj.c);
		obj.methodIndexOf(obj.d);
		obj.methodIndexOf(obj.b,3);
		obj.methodIndexOf(obj.c, 3);
		
	}
	public int methodIndexOf(String str) {
		
		System.out.println(str.indexOf('v'));
		System.out.println(str.indexOf("ve"));
		return str.indexOf('v');
		
	}
	public int methodIndexOf(String str, int a) {
		System.out.println(str.indexOf('e', a));
		System.out.println(str.indexOf("de", a));
		return 0;
		
	}
}
