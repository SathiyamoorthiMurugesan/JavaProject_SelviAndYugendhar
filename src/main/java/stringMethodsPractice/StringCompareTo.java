package stringMethodsPractice;

public class StringCompareTo {


	String a = "Jashwanth Dev Naveen Kumar";
	String b = " jashwanth dev ";
	String c = "Jashwanth DEV ";
	String d = "JASHWANTH DEV NAVEEN KUMAR";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		compareTo() - Compares two Strings and returns positive,negative or 0
//		Returns an integer value
//			if a > b, it returns positive number  
//			if a < b, it returns negative number  
//			if a == b, it returns 0  
//		ClassCastException: If this object cannot get compared with the specified object.
//		NullPointerException: If the specified object is null.
		StringCompareTo obj =new StringCompareTo();
		methodCompareTo(obj.a);
		methodCompareTo(obj.b);
		methodCompareTo(obj.c);
		methodCompareTo(obj.d);
		
	}
	
	public static String methodCompareTo(String abc) {
		
		StringCompareTo obj =new StringCompareTo();
		System.out.println(abc.compareTo(obj.a));
		
		return abc;
		
	}

}
