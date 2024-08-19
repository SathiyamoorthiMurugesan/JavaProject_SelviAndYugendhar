package stringMethodsPractice;

public class ContentEquals {

	static String a = " Jashwanth dev Naveen";
	static String b = "Jashwanth";
	static String c = " dev";
	static String d = "Naveen";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		The contentEquals() method searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer.
//
//		Returns true if the characters exist and false if not.
methodContentEquals(a);
methodContentEquals(b);

String myStr = "Hello";
System.out.println("**************************");
System.out.println(myStr.contentEquals("Hello"));  // true
System.out.println(myStr.contentEquals("e"));      // false
System.out.println(myStr.contentEquals("Hi"));     // false
		
	}

	
	public static boolean methodContentEquals(String abc) {
		
		System.out.println("**************************");
		System.out.println(abc.contentEquals("Naveen"));
		System.out.println(abc.contentEquals(a));
		return abc.contentEquals(a);
		
	}
		
	}

