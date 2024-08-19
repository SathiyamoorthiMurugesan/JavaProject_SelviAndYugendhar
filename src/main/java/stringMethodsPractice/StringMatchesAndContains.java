package stringMethodsPractice;

public class StringMatchesAndContains {

	static String a = "Selvi";
	static String b = " Jashventh dev Naveen Kumar";
	static String c = "Naveen Kumar";
	
	public static void main(String[] args) {
		
//		checks same sequence of string. both are equals return 1 else return false.
		System.out.println("**matches method**");
		System.out.println(a.matches("Selvi"));
		System.out.println(b.matches("dev"));
		System.out.println(c.matches("Naveen"));
		
		System.out.println("Naveen Kumar".matches(c));
		System.out.println("selvi".matches(a));
		
//		contains() - searches the sequence of characters in this string.
//		It returns true if the sequence of char values is found in this string otherwise returns false.

		System.out.println("**contains method**");
        System.out.println(b.contains("dev"));
        System.out.println(b.contains("Kumar"));
        System.out.println(c.contains("Kumar"));

		
	}

	
}
