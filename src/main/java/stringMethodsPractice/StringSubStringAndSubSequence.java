package stringMethodsPractice;

public class StringSubStringAndSubSequence {

	String a = "Selvi Merugan";
	String b = " Jashventh dev";
	String c = "Naveen Kumar";
	public static void main(String[] args) {
		
//		substring() - A part of String is called substring. In other words, substring is a subset of another String.
//		In case of substring() method startIndex is inclusive and endIndex is exclusive.
//		startIndex: inclusive
//		endIndex: exclusive
		
		StringSubStringAndSubSequence obj =new StringSubStringAndSubSequence();
		System.out.println("SubString");
		obj.methodSubString(obj.a);
		obj.methodSubString(obj.b);
//		obj.methodSubString(obj.c);
	
//		subSequence() - returns a new character sequence that is a subsequence of this sequence.
		System.out.println("SubSequence string");
		
		obj.methodSubSequence(obj.a);
		obj.methodSubSequence(obj.b);
	}
	public String methodSubString(String abc) {
		System.out.println(abc.substring(4));
		System.out.println(abc.substring(2, 8));
		return abc;
		
	}
	
	public String methodSubSequence(String abc) {
		
		System.out.println(abc.subSequence(2, 8));
		return a;
		
	}

}
