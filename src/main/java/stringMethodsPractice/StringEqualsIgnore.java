package stringMethodsPractice;

public class StringEqualsIgnore {


	static String a = "Selvi";
	static String r= "JashWanth";
	static String b = " Jashwanth ";
	String c = "Naveen Kumar";
	String d = "Hai";

	public static void main(String[] args) {

	
//		equalsIgnoreCase - similar to equals(). but this does not check case sensitivity(lower and upper case
		StringEqualsIgnore obj = new StringEqualsIgnore();
		obj.mEqualsIgnore(a);
	}
	public boolean mEqualsIgnore(String abc) {
		
		System.out.println(abc.equalsIgnoreCase(a));
		return false;
	
	}
}
