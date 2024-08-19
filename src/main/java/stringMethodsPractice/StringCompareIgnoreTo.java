package stringMethodsPractice;

public class StringCompareIgnoreTo {


	String a = "Jashwanth Dev Naveen Kumar";
	String b = " jashwanth dev ";
	String c = "Jashwanth DEV ";
	String d = "JASHWANTH DEV NAVEEN KUMAR";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		The compareTo() method compares two strings lexicographically.
//
//		The comparison is based on the Unicode value of each character in the strings.
//
//		The method returns 0 if the string is equal to the other string. 
//		A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
		
		
//		compareToIgnoreCase() - Similar to compareTo(), but this ignores case differences(lower and upper case)
		StringCompareTo obj =new StringCompareTo();
		methodCompareIgnoreTo(obj.a);
		methodCompareIgnoreTo(obj.b);
		methodCompareIgnoreTo(obj.c);
		methodCompareIgnoreTo(obj.d);

		
	}
	public static int methodCompareIgnoreTo(String abc) {
		
		StringCompareTo obj =new StringCompareTo();
		System.out.println(abc.compareToIgnoreCase(obj.a));
		return abc.compareToIgnoreCase(obj.a);
		
	}

}
