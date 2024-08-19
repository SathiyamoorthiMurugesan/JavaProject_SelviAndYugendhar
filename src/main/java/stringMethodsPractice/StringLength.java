package stringMethodsPractice;

public class StringLength {

	String a = "Selvi";
	String b = " Jashwanth ";
	String c = "Naveen Kumar";

	public static void main(String[] args) {
		
//		How to get size or length of a String
//		System.out.println(str.length());
	
		StringLength obj = new StringLength();
		obj.stringLength(obj.a);
		obj.stringLength(obj.b);
		obj.stringLength(obj.c);

	}

	public int stringLength(String abc) {

		System.out.println(abc.length());
		return abc.length();
	}

}
