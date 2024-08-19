package stringMethodsPractice;

public class UpperAndLowercase {

	String a = "Pine apple";
	String b = " Jashwanth ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UpperAndLowercase obj=new UpperAndLowercase();
		System.out.println("To Upper case ");
		obj.methodToUppercase(obj.a);
		obj.methodToUppercase(obj.b);
		System.out.println("To Lower case ");
		obj.methodToLowercase(obj.a);
		obj.methodToLowercase(obj.b);
	}

	
	public String methodToUppercase(String abc) {
		
		System.out.println(abc.toUpperCase());
		
		return abc;
		
	}
	public String methodToLowercase(String abc) {
		
		System.out.println(abc.toLowerCase());
		
		return abc;
		
	}
}
