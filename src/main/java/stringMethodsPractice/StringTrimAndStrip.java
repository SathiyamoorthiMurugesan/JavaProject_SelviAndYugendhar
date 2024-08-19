package stringMethodsPractice;

public class StringTrimAndStrip {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "Selvi ";
		String b = " Jashventh dev Naveen Kumar";
		String c = "    \0 Naveen   Kumar "; 
// \0 is stored with numeric value 48. In the end, '\0' is a char literal of value zero,
		
//      trim() - eliminates leading and trailing spaces.
//		The trim() method removes whitespace from both ends of a string.
		
		System.out.println(a.trim());
		System.out.println(b.trim());
		System.out.println(c.trim());
		
//		stripLeading() - Removes the white space from the beginning
//		stripTrailing() - Removes the white space from the end
//		strip() - Removes the white space from both, beginning and the end of string
        System.out.println("**strip/stripLeading/stripTrailing**");
		System.out.println(c.strip());
		System.out.println(c.stripLeading());
		System.out.println(c.stripTrailing());
		
//	difference 	b/w trim() and Strip()
//		strip() is "Unicode-aware" evolution of trim().
//		strip() removes all Unicode whitespace characters (but not all control characters, such as \0)

		//		Meaning trim() removes only characters <= U+0020 (space); 
		
		
	}

}
