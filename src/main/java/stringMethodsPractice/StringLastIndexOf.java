package stringMethodsPractice;

public class StringLastIndexOf {
	String a = "Selvi Merugan";
	String b = " Jashventh dev";
	String c = "Naveen Kumar";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		lastIndexOf() - returns the last index of the given character value or substring.

//		If it is not found, it returns -1. The index counter starts from zero.
		
		StringLastIndexOf obj =new StringLastIndexOf();
		System.out.println("stats from Last Index position ");
		obj.methodLastIndexOf(obj.a);
		obj.methodLastIndexOf(obj.b);
		obj.methodLastIndexOf(obj.c);
		System.out.println("*********");
		obj.methodLastIndexOf(obj.a,5);// returns the index of the value 'e' before the 5th index, which is 1
		obj.methodLastIndexOf(obj.b,3);
		obj.methodLastIndexOf(obj.c,3);

	}
	
	public int methodLastIndexOf(String str) {
		
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.lastIndexOf("ug"));
		return str.indexOf('v');
		
	}
	public int methodLastIndexOf(String str, int a) {
		System.out.println(str.lastIndexOf('e', a));
		System.out.println(str.lastIndexOf("de", a));
		return 0;
		
	}

}
