package stringMethodsPractice;

public class StringStartswithAndEndsWith {

	String a = "Selvi";
	String b = " Jashwanth ";
	String c = "Naveen Kumar";

	public static void main(String[] args) {

//		startsWith() - checks if this string starts with the given prefix. xx`
//		It returns true if this string starts with the given prefix; else returns false.

		StringStartswithAndEndsWith obj = new StringStartswithAndEndsWith();
		System.out.println("compare string starting suffix");
		obj.methodStartsWith(obj.a);
		obj.methodStartsWith(obj.b);
		obj.methodStartsWith(obj.c);

//		endsWith() - checks if this string ends with a given suffix.
//		It returns true if this string ends with the given suffix; else returns false.
		System.out.println("compare string Ending suffix");
		obj.methodEndsWith(obj.a);
		obj.methodEndsWith(obj.b);
		obj.methodEndsWith(obj.c);

	}

	public String methodStartsWith(String str) {
	
		System.out.println(str.startsWith(" Jas"));
		return str;

	}

	public String methodEndsWith(String str) {
		System.out.println(str.endsWith("ar"));
		return str;

	}
}
